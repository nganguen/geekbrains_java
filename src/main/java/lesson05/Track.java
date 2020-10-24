package lesson05;

public class Track extends Obstacle{

    private int trackDistance;

    public Track(String name, int trackDistance) {
        super(name);
        this.trackDistance = trackDistance;
    }

    public int getTrackDistance() {
        return trackDistance;
    }

    @Override
    public boolean doAction(Role participant) {
        if (participant instanceof canRunJump) {
            canRunJump tmp = (canRunJump) participant;
            return tmp.run(getTrackDistance());
        }
        System.out.println(participant.getName() + " can't run");
        return false;
    }

    @Override
    public void getInfo() {
        System.out.printf("Track %s | Distance: %d \t", getName(), getTrackDistance());
    }
}
