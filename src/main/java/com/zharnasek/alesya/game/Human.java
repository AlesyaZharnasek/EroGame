package com.zharnasek.alesya.game;

public abstract class Human {

    private String name;
    private int height;
    private int weight;
    private String phrase;
    private String prefer;

    public Human(String name, int height, int weight, String phrase, String prefer) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.phrase = phrase;
        this.prefer = prefer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPrefer() {
        return prefer;
    }

    public void setPrefer(String prefer) {
        this.prefer = prefer;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public abstract void parameters ();

}
