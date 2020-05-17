package com.zharnasek.alesya.game;

public class Activities {

    private String levelOfDifficulty;
    private String description;
    private String gender;

    public Activities() {
    }

    public Activities(String gender, String levelOfDifficulty, String description) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void descrOutput() {
        if (getGender().equals("m")) {
            System.out.println("for him:" + getLevelOfDifficulty() + " level - " + getDescription());
        } else {
            System.out.println("for her:" + getLevelOfDifficulty() + " level - " + getDescription());
        }
    }
}
