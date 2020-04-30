package br.univali.kob.model;

import java.io.IOException;
import java.text.Collator;
import java.util.Locale;
import java.util.Random;

public class Game {
    private GameScreen gameScreen;

    private Player player;

    private GameState gameState;

    private String word;

    private final Words words;

    private final Random random;

    private PlayerGuessState playerGuessState;

    private Integer wins;

    private Integer loses;

    private Integer charsRightCount;

    public Game() {
        this.gameScreen = null;
        this.player = null;
        this.wins = 0;
        this.loses = 0;
        this.charsRightCount = 0;
        this.gameState = GameState.GAME_WAITING_START;
        this.playerGuessState = PlayerGuessState.ON_GALLOWS;

        this.words = new Words();
        this.random = new Random();
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }

    public Player getPlayer() {
        return player;
    }

    public String getWord() {
        return word;
    }

    public Words getWords() {
        return words;
    }

    public GameState getGameState() {
        return gameState;
    }

    public PlayerGuessState getPlayerGuessState() { return playerGuessState; }

    public Integer getWins() { return wins; }

    public Integer getLoses() { return loses; }

    public void addPlayer(Player player) {
        if (this.player == null) {
            this.player = player;
            this.player.addGame(this);
        }
    }

    public void addGameScreen(GameScreen gameScreen) {
        if (this.gameScreen == null) {
            this.gameScreen = gameScreen;
            gameScreen.addGame(this);
        }
    }

    public void gameStart() throws IOException, InterruptedException {
        this.gameState = GameState.GAME_START;
        this.word = this.words.getPossibilities().get(this.random.nextInt(this.words.getPossibilities().size()));
        this.gameScreen.drawGameStart();
        this.gameLoop();
    }

    private void gameLoop() throws IOException, InterruptedException {
        this.gameState = GameState.GAME_LOOP;
        while (this.gameState == GameState.GAME_LOOP) {
            this.gameScreen.drawGameScreen();
            this.playerGuess();
            this.changeGameStateOnLoop();
        }
        this.gameOver();
    }

    private void gameRestart() throws IOException, InterruptedException {
        this.gameState = GameState.GAME_RESTART;
        this.charsRightCount = 0;
        this.player.getRightGuessed().clear();
        this.player.getWrongGuessed().clear();
        this.playerGuessState = PlayerGuessState.ON_GALLOWS;
        this.gameStart();
    }

    private void gameOver() throws IOException, InterruptedException {
        this.gameScreen.drawGameOverScreen();
        Boolean isRetry = this.gameScreen.drawRestartGameQuestion();
        if (isRetry) {
            this.gameRestart();
        } else {
            this.gameExit();
        }
    }

    private void gameExit() throws IOException, InterruptedException {
        this.gameState = GameState.GAME_EXIT;
        this.gameScreen.drawGameExitScreen();
    }

    private void playerGuess() {
        Character nextGuess = this.guessNewCharLoop();
        Boolean isWrong = true;

        for (Character character : this.word.toLowerCase().toCharArray()) {
            if (character.equals(nextGuess)) {
                isWrong = false;
                this.charsRightCount++;
            }
        }

        if (isWrong) {
            this.playerGuessState = this.playerGuessState.nextState();
        }

        this.player.addGuessedWord(nextGuess, isWrong);
    }

    private Character guessNewCharLoop() {
        Character nextGuess = '-';
        do {
            if (!nextGuess.equals('-')) {
                System.out.println("Erro! Voce ja tentou esta letra, tente outra...");
            }
            nextGuess = Character.toLowerCase(this.gameScreen.drawNextCharacterQuestion());
        } while (this.isPlayerAlreadyTry(nextGuess));
        return nextGuess;
    }

    private Boolean isPlayerAlreadyTry(Character character) {
        if (this.player.getGuessedCharacter().size() <= 0) { return false; }
        Collator collator = Collator.getInstance(new Locale("pt", "BR"));
        collator.setStrength(Collator.PRIMARY);
        return this.player.getGuessedCharacter()
                .stream()
                .anyMatch(character1 -> collator.compare(String.valueOf(character), String.valueOf(character1)) == 0);
    }

    private void changeGameStateOnLoop() {
        if (this.playerGuessState == PlayerGuessState.ON_LEGS) {
            this.gameState = GameState.GAME_PLAYER_LOST;
            this.loses++;
        }

        if (this.charsRightCount == this.word.length()) {
            this.gameState = GameState.GAME_PLAYER_WIN;
            this.wins++;
        }
    }

//    private Integer getPlayerRightGuessedCount() {
//        Integer count = 0;
//        Collator collator = Collator.getInstance(new Locale("pt", "BR"));
//        collator.setStrength(Collator.PRIMARY);
//        for (Character character : this.word.toCharArray()) {
//            for (Character guessed : this.player.getRightGuessed()) {
//                if (collator.compare(String.valueOf(character), String.valueOf(guessed)) == 0) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
}
