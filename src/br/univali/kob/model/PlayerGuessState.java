package br.univali.kob.model;

public enum PlayerGuessState {
    ON_GALLOWS(0) {
        @Override
        public PlayerGuessState nextState() {
            return ON_HEAD;
        }
    },
    ON_HEAD(1) {
        @Override
        public PlayerGuessState nextState() {
            return ON_BODY;
        }
    },
    ON_BODY(2) {
        @Override
        public PlayerGuessState nextState() {
            return ON_LEFT_ARM;
        }
    },
    ON_LEFT_ARM(3) {
        @Override
        public PlayerGuessState nextState() {
            return ON_ARMS;
        }
    },
    ON_ARMS(4) {
        @Override
        public PlayerGuessState nextState() {
            return ON_LEFT_LEG;
        }
    },
    ON_LEFT_LEG(5) {
        @Override
        public PlayerGuessState nextState() {
            return ON_LEGS;
        }
    },
    ON_LEGS(6) {
        @Override
        public PlayerGuessState nextState() {
            return ON_GALLOWS;
        }
    };

    private Integer value;

    PlayerGuessState(Integer value) {
        this.value = value;
    }

    public abstract PlayerGuessState nextState();

    public Integer getValue() { return this.value; }
}
