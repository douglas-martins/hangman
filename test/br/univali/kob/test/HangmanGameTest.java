package br.univali.kob.test;

import br.univali.kob.model.Game;

import java.io.IOException;

public class HangmanGameTest {
    private Game game;

    public static void main(String[] args) throws IOException, InterruptedException {
        HangmanGameTest hangmanGameTest = new HangmanGameTest();

        hangmanGameTest.createGameTest();
        hangmanGameTest.startGameTest();
    }

    public void createGameTest() {
        this.game = new Game();
    }

    public void startGameTest() throws IOException, InterruptedException {
        this.game.gameStart();
    }
}
