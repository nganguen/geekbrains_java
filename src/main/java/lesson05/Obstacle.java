package lesson05;

public abstract class Obstacle {

    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean doAction(Role role);

    public abstract void getInfo();
}