package br.univali.kob.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Player {
    private final List<Character> wrongGuessed;

    private final List<Character> rightGuessed;

    private Game game;

    public Player(Game game) {
        this.wrongGuessed = new ArrayList<>();
        this.rightGuessed = new ArrayList<>();
        this.addGame(game);
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
        return rightGuessed;
    }

    public Game getGame() {
        return game;
    }

    public void addGame(Game game) {
        if (this.game == null) {
            this.game = game;
            game.addPlayer(this);
        }
    }

    public void addGuessedWord(Character character, Boolean isWrong) {
        if (isWrong) {
            this.wrongGuessed.add(character);
        } else {
            this.rightGuessed.add(character);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(wrongGuessed, player.wrongGuessed) &&
                Objects.equals(rightGuessed, player.rightGuessed) &&
                Objects.equals(game, player.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrongGuessed, rightGuessed, game);
    }

    @Override
    public String toString() {
        return "Player{" +
                "wrongGuessed=" + wrongGuessed +
                ", rightGuessed=" + rightGuessed +
                ", game=" + game +
                '}';
    }
}
