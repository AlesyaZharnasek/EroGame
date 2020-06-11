package com.zharnasek.alesya.game;

import java.util.ArrayList;
import java.util.Random;

public class ActivityService {

    public String getRandomActivities(Gender gender, GameResource gameResources) {
        Random rand = new Random();
        ArrayList<Activities> list = new ArrayList<>();
        for (int i = 0; i < gameResources.getActivities().size() - 1; i++) {
            if (gameResources.getActivities().get(i).getGender().equals((gender))) {
                list.add(gameResources.getActivities().get(i));
            }
        }
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex).toString();
    }
}
