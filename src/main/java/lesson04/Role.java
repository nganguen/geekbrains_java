package lesson04;

public abstract class Role {

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Role(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public String getName() {
        return name;
    }

    public  void run() {
        System.out.println(this.name + " success ran");
    }

    public void jump() {
        System.out.println(this.name + " success jumped");
    }

    public void cantRun() {
        System.out.println(this.name + " unsuccess ran");
    }

    public void cantJump() {
        System.out.println(this.name + " unsuccess jumped");
    }

    public abstract void getInfo();
}
