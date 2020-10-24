package lesson05;

public class Robot extends Role implements canRunJump, canSwim {

    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Robot(String name, int runDistance, int jumpHeight, int swimDistance) {
        super(name);
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public boolean run(int trackDistance) {
        if (trackDistance > this.runDistance) {
            System.out.println(this.getName() + " unsuccess ran");
            return false;
        }
        System.out.println(this.getName() + " success ran");
        return true;
    }

    public boolean jump(int wallHeight) {
        if (wallHeight > this.jumpHeight) {
            System.out.println(this.getName() + " unsuccess jumped");
            return false;
        }
        System.out.println(this.getName() + " success jumped");
        return true;
    }

    public boolean swim(int poolLong) {
        if (poolLong > this.swimDistance) {
            System.out.println(this.getName() + " unsuccess swam");
            return false;
        }
        System.out.println(this.getName() + " success swam");
        return true;
    }

    @Override
    public void getInfo() {
        System.out.printf("Robot %s | runDistance: %d | jumpHeight: %d | swimDistance: %d\n", getName(), getRunDistance(), getJumpHeight(), getSwimDistance());
    }
}
