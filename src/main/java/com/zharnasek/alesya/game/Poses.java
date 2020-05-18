package com.zharnasek.alesya.game;

public class Poses {

    private String name;
    private String description;
    private String profit;

    public Poses(String name, String description, String profit) {
        this.name = name;
        this.description = description;
        this.profit = profit;
    }

    public void setPoseName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getDescription() {
        return description;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getProfit() {
        return profit;
    }

    public void descrOutput () {
        System.out.println(getName());
        System.out.println("How To Do It: " + getDescription());
        System.out.println("Why: " + getProfit());
    }

}
