package lesson04;

public class Wall extends Obstacle {

    private int wallHeight;

    public Wall(String name, int wallHeight) {
        super(name);
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    @Override
    public boolean doAction(Role role) {
        if (role.getJumpHeight() < getWallHeight()) {
            role.cantJump();
            return false;
        }
        role.jump();
        return true;
    }

    public void getInfo() {
        System.out.printf("Wall %s | Height: %d \t", this.name, getWallHeight());
    }
}
