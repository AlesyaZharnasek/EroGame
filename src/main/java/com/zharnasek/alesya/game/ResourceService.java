package com.zharnasek.alesya.game;

import java.util.Scanner;

public class ResourceService implements IResourceService {
    
    private IPeopleRepository peopleRepository = new PeopleRepositoryTxt();
    private IPoseRepository poseRepository = new PoseRepositoryTxt();
    private IActivitiesRepository activitiesRepository = new ActivitiesRepositoryTxt();
    private Scanner scanner = new Scanner(System.in);

    public GameResource loadResources() {
            System.out.print("Input preferred language(ru or en): ");
            StateApp.setLanguage(scanner.next().trim());
        return new GameResource(peopleRepository.loadPeople(), poseRepository.loadPoses(), activitiesRepository.loadActivities());
    }
}
