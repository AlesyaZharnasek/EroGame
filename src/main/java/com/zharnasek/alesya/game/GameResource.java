package com.zharnasek.alesya.game;

import java.util.List;
public class GameResource {
    private List<Human> humans;
    private List<Poses> poses;
    private List<Activities> activities;

    public GameResource(List<Human> humans, List<Poses> poses, List<Activities> activities){
        this.humans = humans;
        this.poses = poses;
        this.activities = activities;
    }

    public List<Human> getHumans() {
        return humans;
    }
    
    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }
    
    public List<Poses> getPoses() {
        return poses;
    }

    public void setPoses(List<Poses> poses) {
        this.poses = poses;
    }

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }
}
