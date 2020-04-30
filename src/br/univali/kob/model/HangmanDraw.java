package br.univali.kob.model;

public enum HangmanDraw {
    GALLOWS(PlayerGuessState.ON_HEAD, drawGallows()),
    HEAD(PlayerGuessState.ON_BODY, drawHead()),
    BODY(PlayerGuessState.ON_LEFT_ARM, drawBody()),
    LEFT_ARM(PlayerGuessState.ON_ARMS, drawLeftArm()),
    ARMS(PlayerGuessState.ON_ARMS, drawRightArm()),
    LEFT_LEG(PlayerGuessState.ON_LEFT_LEG, drawLeftLeg()),
    LEGS(PlayerGuessState.ON_LEGS, drawRightLeg());

    private final PlayerGuessState state;

    private final String draw;

    HangmanDraw(PlayerGuessState state, String draw) {
        this.state = state;
        this.draw = draw;
    }

    public PlayerGuessState getState() { return this.state; }

    public String getDraw() { return this.draw; }

    private static String drawGallows() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(System.getProperty("line.separator"))
                .append("   ____________")
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")
                .append(System.getProperty("line.separator"))
                .append("   |               ")
                .append(System.getProperty("line.separator"))
                .append("   |               ")
                .append(System.getProperty("line.separator"))
                .append("   |               ")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("___|___")
                .append(System.getProperty("line.separator"));

        return stringBuilder.toString();
    }

    private static String drawHead() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(System.getProperty("line.separator"))
                .append("   ____________")
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")

                // HEAD
                .append(System.getProperty("line.separator"))
                .append("   |         /   \\")
                .append(System.getProperty("line.separator"))
                .append("   |        | 0 0 |")
                .append(System.getProperty("line.separator"))
                .append("   |         \\_∩_/")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("___|___")
                .append(System.getProperty("line.separator"));

        return stringBuilder.toString();
    }

    private static String drawBody() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(System.getProperty("line.separator"))
                .append("   ____________")
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")

                // HEAD
                .append(System.getProperty("line.separator"))
                .append("   |         /   \\")
                .append(System.getProperty("line.separator"))
                .append("   |        | 0 0 |")
                .append(System.getProperty("line.separator"))
                .append("   |         \\_∩_/")

                // BODY
                .append(System.getProperty("line.separator"))
                .append("   |           |")
                .append(System.getProperty("line.separator"))
                .append("   |           |")

                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("___|___")
                .append(System.getProperty("line.separator"));

        return stringBuilder.toString();
    }

    private static String drawLeftArm() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(System.getProperty("line.separator"))
                .append("   ____________")
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")

                // HEAD
                .append(System.getProperty("line.separator"))
                .append("   |         /   \\")
                .append(System.getProperty("line.separator"))
                .append("   |        | 0 0 |")
                .append(System.getProperty("line.separator"))
                .append("   |         \\_∩_/")

                // LEFT ARM
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")
                .append(System.getProperty("line.separator"))
                .append("   |         / | ")

                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("___|___")
                .append(System.getProperty("line.separator"));

        return stringBuilder.toString();
    }

    private static String drawRightArm() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(System.getProperty("line.separator"))
                .append("   ____________")
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")

                // HEAD
                .append(System.getProperty("line.separator"))
                .append("   |         /   \\")
                .append(System.getProperty("line.separator"))
                .append("   |        | 0 0 |")
                .append(System.getProperty("line.separator"))
                .append("   |         \\_∩_/")

                // RIGHT ARM
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")
                .append(System.getProperty("line.separator"))
                .append("   |         / | \\")

                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("___|___")
                .append(System.getProperty("line.separator"));

        return stringBuilder.toString();
    }

    private static String drawLeftLeg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(System.getProperty("line.separator"))
                .append("   ____________")
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")

                // HEAD
                .append(System.getProperty("line.separator"))
                .append("   |         /   \\")
                .append(System.getProperty("line.separator"))
                .append("   |        | 0 0 |")
                .append(System.getProperty("line.separator"))
                .append("   |         \\_∩_/")

                // RIGHT ARM
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")
                .append(System.getProperty("line.separator"))
                .append("   |         / | \\")

                // LEFT LEG
                .append(System.getProperty("line.separator"))
                .append("   |          /  ")
                .append(System.getProperty("line.separator"))
                .append("   |         /   ")

                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("___|___")
                .append(System.getProperty("line.separator"));

        return stringBuilder.toString();
    }

    private static String drawRightLeg() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(System.getProperty("line.separator"))
                .append("   ____________")
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")

                // HEAD
                .append(System.getProperty("line.separator"))
                .append("   |         /   \\")
                .append(System.getProperty("line.separator"))
                .append("   |        | 0 0 |")
                .append(System.getProperty("line.separator"))
                .append("   |         \\_∩_/")

                // RIGHT ARM
                .append(System.getProperty("line.separator"))
                .append("   |          _|_")
                .append(System.getProperty("line.separator"))
                .append("   |         / | \\")

                // RIGHT LEG
                .append(System.getProperty("line.separator"))
                .append("   |          / \\ ")
                .append(System.getProperty("line.separator"))
                .append("   |         /   \\")

                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("   |")
                .append(System.getProperty("line.separator"))
                .append("___|___")
                .append(System.getProperty("line.separator"));

        return stringBuilder.toString();
    }
}
