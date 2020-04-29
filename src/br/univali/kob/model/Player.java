package br.univali.kob.model;

import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Character> wrongGuessed;

    private List<Character> rightGuessed;

    private Game game;

    public Player(Game game) {
        this.wrongGuessed = new ArrayList<>();
        this.rightGuessed = new ArrayList<>();
        this.game = game;
    }

    public List<Character> getGuessedCharacter() {
        List<Character> allGuesses = new ArrayList<>();
        allGuesses.addAll(this.wrongGuessed);
        allGuesses.addAll(this.rightGuessed);
        return allGuesses;
    }

    public List<Character> getWrongGuessed() {
        return wrongGuessed;
    }

    public List<Character> getRightGuessed() {
        return wrongGuessed;
    }

    public Game getGame() {
        return game;
    }

    public void addGuessedWord(Character character, Boolean isWrong) {
        if (isWrong) {
            this.wrongGuessed.add(character);
        } else {
            this.rightGuessed.add(character);
        }
    }
}
