package br.univali.kob.test;

import br.univali.kob.model.Game;
import br.univali.kob.model.GameScreen;
import br.univali.kob.model.Player;

import java.io.IOException;

public class HangmanGameTest {
    private Game game;

    private Player player;

    private GameScreen gameScreen;

    public static void main(String[] args) throws IOException, InterruptedException {
        HangmanGameTest hangmanGameTest = new HangmanGameTest();

        hangmanGameTest.createGameTest();
        hangmanGameTest.startGameTest();
    }

    public void createGameTest() {
        this.game = new Game();
        this.createPlayerTest();
        this.createGameScreenTest();
    }

    public void createPlayerTest() {
        this.player = new Player(this.game);
    }

    public void createGameScreenTest() {
        this.gameScreen = new GameScreen(this.game);
    }

    public void startGameTest() throws IOException, InterruptedException {
        this.game.gameStart();
    }
}
