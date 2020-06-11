package com.zharnasek.alesya.game;

import java.util.Random;
import java.util.Scanner;

public class PeopleDemo {

    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        IActions humanAction = new HumanActions();
        ResourceService resourceService = new ResourceService();
        GameResource gameResources = resourceService.loadResources();
        ActivityService activityService = new ActivityService();

        while (true) {
            System.out.print("Input name, pose or activity('exit' to stop): ");
            String num = scanner.next().trim();

            if (num.equals("exit")) {
                break;
            }

            if (num.equals("pose")) {
                Random rand = new Random();
                int randomIndex = rand.nextInt(gameResources.getPoses().size());
                gameResources.getPoses().get(randomIndex).descrOutput();
            }

            if (num.equals("activity")) {
                System.out.print("Input name for him: ");
                Gamer gamerMale = new Gamer(scanner.next(), Gender.MALE);
                System.out.print("Input name for her: ");
                Gamer gamerFemale = new Gamer(scanner.next(), Gender.FEMALE);

                do {
                    System.out.println(gamerFemale.getName() + ", " + activityService.getRandomActivities(gamerFemale.getGender(), gameResources));
                    System.out.print("input 'next' to continue, input 'exit' to finish: ");
                    if (scanner.next().equals("next")) {
                        System.out.println(gamerMale.getName() + ", " + activityService.getRandomActivities(gamerMale.getGender(), gameResources));
                        System.out.print("input 'next' to continue, input 'exit' to finish: ");
                    }
                } while (!scanner.next().equals("exit"));
                flag = true;
            }

            for (int i = 0; i < gameResources.getHumans().size(); i++) {
                if (gameResources.getHumans().get(i).getName().equals(num)) {
                    humanAction.say(gameResources.getHumans().get(i));
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("An incorrect name, try again.");
            }
        }
    }
}
