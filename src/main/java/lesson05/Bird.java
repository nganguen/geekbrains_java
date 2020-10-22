package lesson05;

public class Bird extends Role implements canFly {

    private int flightDistance;

    public Bird(String name, int flightDistance) {
        super(name);
        this.flightDistance = flightDistance;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public boolean fly(int abyssLong) {
        if (abyssLong > this.getFlightDistance()) {
            System.out.println(getName() + " unsuccess flew");
            return false;
        }
        System.out.println(getName() + " success flew");
        return true;
    }

    @Override
    public void getInfo() {
        System.out.printf("Bird %s | swimDistance: %d\n", getName(), getFlightDistance());
    }
}
