package lesson04;

public class Robot extends Role {

    public Robot(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void getInfo() {
        System.out.printf("Robot %s | runDistance: %d | jumpHeight: %d\n", getName(), getRunDistance(), getJumpHeight());
    }
}
