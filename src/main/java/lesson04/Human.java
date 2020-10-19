package lesson04;

public class Human extends Role {

    public Human(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void getInfo() {
        System.out.printf("Human %s | runDistance: %d | jumpHeight: %d\n", getName(), getRunDistance(), getJumpHeight());
    }
}
