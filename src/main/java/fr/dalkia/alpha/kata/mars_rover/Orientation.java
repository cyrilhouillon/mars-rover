package fr.dalkia.alpha.kata.mars_rover;

enum Orientation{
    N {
        @Override
        public Orientation getRight() {
            return E;
        }
    },S {
        @Override
        public Orientation getRight() {
            return W;
        }
    },W {
        @Override
        public Orientation getRight() {
            return N;
        }
    },E {
        @Override
        public Orientation getRight() {
            return S;
        }
    };

    public abstract Orientation getRight();
}
