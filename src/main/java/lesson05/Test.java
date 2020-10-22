package lesson05;

public class Test {

    public static void main(String[] args) {
        int distance, height;
        Role[] participants = new Role[] {
                new Human("Mike", 7,5,7),
                new Cat("Lion", 6,3),
                new Robot("Jon", 5,9,10),
                new Bird("Kim", 5),
                new Fish("Nemo", 10)
        };

        Obstacle[] obstacles = new Obstacle[] {
                new Pool("pool1", 6),
                new Track("track1", 6),
                new Wall("wall1", 4),
                new Abyss("abyss1", 9),
        };

        for (Role participant : participants) {
            participant.getInfo();
            int count = 0;
            for (Obstacle obstacle : obstacles) {
                obstacle.getInfo();
                if (!obstacle.doAction(participant)) {
                    System.out.println(participant.getName()+ " stopped!");
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println(participant.getName()+ " finished!");
            System.out.println("---------------------------------");
        }
    }
}
