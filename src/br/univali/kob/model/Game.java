package br.univali.kob.model;

import java.util.List;
import java.util.Random;

public class Game {
    private GameScreen gameScreen;

    private Player player;

    private GameState gameState;

    private String word;

    private Words words;

    private Random random;

    public Game(Player player, GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        this.player = player;
        this.gameState = GameState.GAME_WAITING_START;

        this.words = new Words();
        this.random = new Random();
        this.word = this.words.getPossibilities().get(this.random.nextInt(this.words.getPossibilities().size()));
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

    public void loop() {
        while (this.gameState == GameState.GAME_LOOP) {

        }
    }

    public void gameOver() {

    }
}
