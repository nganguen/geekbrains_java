package lesson04;

import java.util.Random;

import java.util.Scanner;

public class Test {

    private static final int NUMBER_OF_PARTICIPANTS = 3;
    private static final int NUMBER_OF_OBSTACLES = 3;

    public static void main(String[] args) {
        Role[] participants = new Role[NUMBER_OF_PARTICIPANTS];
        Obstacle[] obstacles = new Obstacle[NUMBER_OF_OBSTACLES];
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        String name;
        int distance, height;
        int id;

        System.out.println("Insert participant's roleId (1-human/2-cat/3-robot) & name:");
        for (int i = 0; i < NUMBER_OF_PARTICIPANTS; i++) {
            id = scanner.nextInt();
            name = scanner.next();
            distance = rnd.nextInt(10);
            height = rnd.nextInt(10);
            if (id == 1)
                participants[i] = new Human(name, distance, height);
            if (id == 2)
                participants[i] = new Cat(name, distance, height);
            if (id == 3)
                participants[i] = new Robot(name, distance, height);
        }

        System.out.println("Insert obstacle's id (1-track/2-wall) & name:");
        for (int i = 0; i < NUMBER_OF_OBSTACLES; i++) {
            id = scanner.nextInt();
            name = scanner.next();
            if (id == 1) {
                distance = rnd.nextInt(10);
                obstacles[i] = new Track(name, distance);
            }
            if (id == 2) {
                height = rnd.nextInt(10);
                obstacles[i] = new Wall(name, height);
            }
        }

        for (int i = 0; i < NUMBER_OF_PARTICIPANTS; i++) {
            participants[i].getInfo();
            for (int j = 0; j < NUMBER_OF_OBSTACLES; j++) {
                obstacles[j].getInfo();
                if (!obstacles[j].doAction(participants[i])) {
                    System.out.println(participants[i].getName()+ " stopped!");
                    break;
                }
            }
            System.out.println("---------------------------------");
        }

    }
}
