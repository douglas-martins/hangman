package br.univali.kob.model;

public enum HangmanDraw {
    GALLOWS(drawGallows()),
    HEAD(drawHead()),
    BODY(drawBody()),
    LEFT_ARM(drawLeftArm()),
    RIGHT_ARM(drawRightArm()),
    LEFT_LEG(drawLeftLeg()),
    RIGHT_LEG(drawRightLeg());

    private final String draw;

    HangmanDraw(String draw) {
        this.draw = draw;
    }

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
