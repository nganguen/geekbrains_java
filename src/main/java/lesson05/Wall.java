package lesson05;


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
    public boolean doAction(Role participant) {
        if (participant instanceof canRunJump) {
            canRunJump tmp = (canRunJump) participant;
            return tmp.jump(getWallHeight());
        }
        System.out.println(participant.getName() + " can't jump");
        return false;
    }

    @Override
    public void getInfo() {
        System.out.printf("Wall %s | Height: %d \t", getName(), getWallHeight());
    }
}
