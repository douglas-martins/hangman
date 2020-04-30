package br.univali.kob.model;

import java.io.IOException;
import java.text.Collator;
import java.util.Locale;

public class GameScreen {
    private Game game;

    private HangmanDraw hangmanDraw;

    public GameScreen(Game game) {
        this.hangmanDraw = HangmanDraw.GALLOWS;
        this.addGame(game);
    }

    public void addGame(Game game) {
        if (this.game == null) {
            this.game = game;
            game.addGameScreen(this);
        }
    }

    public void drawGameStart() throws IOException, InterruptedException {
        this.clearScreen();
        System.out.println("Bem vindo ao Jogo da Forca!");
        Console.waitEnter();
    }

    public void drawGameScreen() throws IOException, InterruptedException {
        this.clearScreen();
        this.drawHangman();
        this.drawWord();
        this.drawGuessedCharacters();
    }

    public void drawGameOverScreen() throws IOException, InterruptedException {
        this.clearScreen();
        System.out.println("Game Over!");
        this.drawHangman();
        System.out.println();

        if (this.game.getGameState() == GameState.GAME_PLAYER_WIN) {
            System.out.println("Parabens! Voce acertou a palavra");
        } else {
            System.out.println("Que pena! Voce nao conseguiu adivinhar a palavra");
        }
        System.out.println("A palavra era: " + this.game.getWord());
        this.drawGuessedCharacters();
        System.out.println();
    }

    public void drawGameExitScreen() throws IOException, InterruptedException {
        this.clearScreen();
        System.out.println("Obrigado por jogar!");
        System.out.println("Voce acertou um total de " + this.game.getWins());
        System.out.println("Voce errou um total de " + this.game.getLoses());
    }

    public Character drawNextCharacterQuestion() {
        return Console.readCharacter("Entre com um novo palpite: ");
    }

    public Boolean drawRestartGameQuestion() {
        return Console.askChar("Deseja jogar novamente? (s/n)");
    }

    public void clearScreen() throws InterruptedException, IOException {
        Console.clear();
    }

    private void drawHangman() {
        switch (this.game.getPlayerGuessState()) {
            case ON_HEAD:
                this.hangmanDraw = HangmanDraw.HEAD;
                break;
            case ON_BODY:
                this.hangmanDraw = HangmanDraw.BODY;
                break;
            case ON_LEFT_ARM:
                this.hangmanDraw = HangmanDraw.LEFT_ARM;
                break;
            case ON_ARMS:
                this.hangmanDraw = HangmanDraw.ARMS;
                break;
            case ON_LEFT_LEG:
                this.hangmanDraw = HangmanDraw.LEFT_LEG;
                break;
            case ON_LEGS:
                this.hangmanDraw = HangmanDraw.LEGS;
                break;
            default:
                this.hangmanDraw = HangmanDraw.GALLOWS;
                break;
        }

        System.out.println(this.hangmanDraw.getDraw());
    }

    private void drawWord() {
        for (Character character : this.game.getWord().toCharArray()) {
            Collator collator = Collator.getInstance(new Locale("pt", "BR"));
            collator.setStrength(Collator.PRIMARY);
            Boolean hasWord = this.game.getPlayer().getGuessedCharacter().stream()
                    .anyMatch(character1 -> collator.compare(String.valueOf(character), String.valueOf(character1)) == 0);

            if (hasWord) {
                System.out.print(character);
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
        System.out.println();
    }

    private void drawGuessedCharacters() {
        System.out.print("Letras tentadas => ");
        for (Character character : this.game.getPlayer().getGuessedCharacter()) {
            System.out.print(character + " ");
        }
        System.out.println();
    }
}
