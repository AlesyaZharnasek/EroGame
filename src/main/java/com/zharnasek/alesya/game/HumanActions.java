package com.zharnasek.alesya.game;

public class HumanActions implements IActions  {
    @Override
    public void say(Human human) {
        System.out.println(human.getName() + " says: " + human.getPhrase());
    }

    @Override
    public void prefer(Human human) {
        System.out.println("I like " + human.getPrefer());
    }

    @Override
    public void greeting(Human human) {
        System.out.println("Hi, " + human.getName());
    }
}
