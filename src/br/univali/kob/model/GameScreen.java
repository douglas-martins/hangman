package br.univali.kob.model;

public class GameScreen {
    private Game game;

    private HangmanDraw hangmanDraw;

    public GameScreen(Game game) {
        this.game = game;

        this.hangmanDraw = HangmanDraw.GALLOWS;
    }

    public void drawHangman() {
        switch (this.game.getPlayer().getWrongGuessed().size()) {
            case 1:
                this.hangmanDraw = HangmanDraw.HEAD;
                break;
            case 2:
                this.hangmanDraw = HangmanDraw.BODY;
                break;
            case 3:
                this.hangmanDraw = HangmanDraw.LEFT_ARM;
                break;
            case 4:
                this.hangmanDraw = HangmanDraw.RIGHT_ARM;
                break;
            case 5:
                this.hangmanDraw = HangmanDraw.LEFT_LEG;
                break;
            case 6:
                this.hangmanDraw = HangmanDraw.RIGHT_LEG;
                break;
            default:
                this.hangmanDraw = HangmanDraw.GALLOWS;
                break;
        }

        System.out.println(this.hangmanDraw.getDraw());
    }

    public void drawWord() {
        for (Character character : this.game.getWord().toCharArray()) {
            if (this.game.getPlayer().getRightGuessed().contains(character)) {
                // PRINT THE CHARACTER
            } else {
                // PRINT _
            }
        }
    }
}
