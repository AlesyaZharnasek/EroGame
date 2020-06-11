package com.zharnasek.alesya.game;

import java.util.Objects;

public class Gamer {

    private String name;
    private Gender gender;

    public Gamer() {
    }

    public Gamer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Gamer gamer = (Gamer) o;
        return Objects.equals(name, gamer.name) &&
                gender == gamer.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }
}
