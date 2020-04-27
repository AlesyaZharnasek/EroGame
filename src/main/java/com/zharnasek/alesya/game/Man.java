package com.zharnasek.alesya.game;

public class Man extends Human {

    private int lenght;

    public Man(String name, int height, int weight, String phrase, String prefer, int lenght) {
        super(name, height, weight, phrase, prefer);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void parameters() {
        System.out.println("My parameters.");
        System.out.println("weight: " + getWeight() + " / hieght: " + getHeight() + " / penis lenght: " + getLenght());
    }
}
