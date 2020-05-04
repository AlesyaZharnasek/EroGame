package com.zharnasek.alesya.game;

public class Poses {

    private String Name;
    private String Description;
    private String Profit;

    public Poses(String Name, String Description, String Profit){
        this.Name = Name;
        this.Description = Description;
        this.Profit = Profit;
    }

    public void setPoseName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    public void setProfit(String Profit) {
        this.Profit = Profit;
    }

    public String getProfit() {
        return Profit;
    }

    public void descrOutput () {
        System.out.println(getName());
        System.out.println("How To Do It: " + getDescription());
        System.out.println("Why: " + getProfit());
    }

}
