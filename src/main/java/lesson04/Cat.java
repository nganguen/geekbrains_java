package lesson04;

public class Cat extends Role {

    public Cat(String name, int runDistance, int jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void getInfo() {
        System.out.printf("Cat %s | runDistance: %d | jumpHeight: %d\n", getName(), getRunDistance(), getJumpHeight());
    }

}
