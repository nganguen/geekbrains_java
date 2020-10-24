package lesson05;

public class Abyss extends Obstacle {

    private int abyssLong;

    public Abyss(String name, int abyssLong) {
        super(name);
        this.abyssLong = abyssLong;
    }

    public int getAbyssLong() {
        return abyssLong;
    }

    @Override
    public boolean doAction(Role participant) {
        if (participant instanceof canFly) {
            canFly tmp = (canFly) participant;
            return tmp.fly(getAbyssLong());
        }
        System.out.println(participant.getName() + " can't fly");
        return false;
    }

    @Override
    public void getInfo() {
        System.out.printf("Abyss %s | Long: %d \t", getName(), getAbyssLong());
    }
}
