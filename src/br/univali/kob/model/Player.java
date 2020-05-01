package br.univali.kob.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Player {
    private final List<Character> wrongGuessed;

    private final List<Character> rightGuessed;

    public Player() {
        this.wrongGuessed = new ArrayList<>();
        this.rightGuessed = new ArrayList<>();
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
                Objects.equals(rightGuessed, player.rightGuessed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrongGuessed, rightGuessed);
    }

    @Override
    public String toString() {
        return "Player{" +
                "wrongGuessed=" + wrongGuessed +
                ", rightGuessed=" + rightGuessed +
                '}';
    }
}
