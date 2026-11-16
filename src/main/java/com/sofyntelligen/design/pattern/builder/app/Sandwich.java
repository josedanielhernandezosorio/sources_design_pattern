package com.sofyntelligen.design.pattern.builder.app;

public class Sandwich {

    private final String bread;
    private final boolean cheese;
    private final boolean tomato;
    private final String sauce;

    private Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.sauce = builder.sauce;
    }

    public static class Builder {

        private String bread;
        private boolean cheese = false;
        private boolean tomato = false;
        private String sauce = "none";

        public Builder(String bread){
            this.bread = bread;
        }

        public Builder cheese(){
            this.cheese = true;
            return this;
        }

        public Builder tomato(){
            this.tomato = true;
            return this;
        }

        public Builder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public Sandwich builder() {
            return new Sandwich(this);
        }

    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", cheese=" + cheese +
                ", tomato=" + tomato +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
