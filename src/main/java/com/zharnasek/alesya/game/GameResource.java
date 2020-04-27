package com.zharnasek.alesya.game;

import java.util.List;
public class GameResource {
    private List<Human> humans;
    private List<Poses> poses;

    public GameResource(List<Human> humans, List<Poses> poses){
        this.humans = humans;
        this.poses = poses;
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

}
