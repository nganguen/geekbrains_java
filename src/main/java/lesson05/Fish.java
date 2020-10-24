package lesson05;

public class Fish extends Role implements canSwim {

    private int swimDistance;

    public Fish(String name, int swimDistance) {
        super(name);
        this.swimDistance = swimDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public boolean swim(int poolLong) {
        if (poolLong > this.getSwimDistance()) {
            System.out.println(getName() + " unsuccess swam");
            return false;
        }
        System.out.println(getName() + " success swam");
        return true;
    }

    @Override
    public void getInfo() {
        System.out.printf("Fish %s | swimDistance: %d\n", getName(), getSwimDistance());
    }
}
