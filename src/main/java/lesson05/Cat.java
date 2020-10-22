package lesson05;

public class Cat extends Role implements canRunJump {

    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        super(name);
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public boolean run(int trackDistance) {
        if (trackDistance > this.getRunDistance()) {
            System.out.println(this.getName() + " unsuccess ran");
            return false;
        }
        System.out.println(this.getName() + " success ran");
        return true;
    }

    public boolean jump(int wallHeight) {
        if (wallHeight > this.getJumpHeight()) {
            System.out.println(this.getName() + " unsuccess jumped");
            return false;
        }
        System.out.println(this.getName() + " success jumped");
        return true;
    }

    @Override
    public void getInfo() {
        System.out.printf("Cat %s | runDistance: %d | jumpHeight: %d\n", getName(), getRunDistance(), getJumpHeight());
    }
}
