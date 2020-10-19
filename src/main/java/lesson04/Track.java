package lesson04;

public class Track extends Obstacle {

    private int trackDistance;

    public Track(String name, int trackDistance) {
        super(name);
        this.trackDistance = trackDistance;
    }

    public int getTrackDistance() {
        return trackDistance;
    }

    @Override
    public boolean doAction(Role role) {
        if (role.getRunDistance() < getTrackDistance()) {
            role.cantRun();
            return false;
        }
        role.run();
        return true;
    }

    public void getInfo() {
        System.out.printf("Track %s | Distance: %d \t", this.name, getTrackDistance());
    }
}
