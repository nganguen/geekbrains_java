package lesson05;

public class Pool extends Obstacle {

    private int poolLong;

    public Pool(String name, int poolLong) {
        super(name);
        this.poolLong = poolLong;
    }

    public int getPoolLong() {
        return poolLong;
    }

    @Override
    public boolean doAction(Role participant) {
        if (participant instanceof canSwim) {
            canSwim tmp = (canSwim) participant;
            return tmp.swim(getPoolLong());
        }
        System.out.println(participant.getName() + " can't swim");
        return false;
    }

    @Override
    public void getInfo() {
        System.out.printf("Pool %s | Long: %d \t", getName(), getPoolLong());
    }
}
