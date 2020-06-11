package com.zharnasek.alesya.game;

public class Activities {

    private String levelOfDifficulty;
    private String description;
    private Gender gender;

    public Activities() {
    }

    public Activities(Gender gender, String levelOfDifficulty, String description) {
        this.levelOfDifficulty = levelOfDifficulty;
        this.description = description;
        this.gender = gender;
    }

    public String getLevelOfDifficulty() {
        return levelOfDifficulty;
    }

    public void setLevelOfDifficulty(String levelOfDifficulty) {
        this.levelOfDifficulty = levelOfDifficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return description;
    }
}
