package lesson04;

public abstract class Obstacle {

    public String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public abstract boolean doAction(Role role);

    public abstract void getInfo();
}
