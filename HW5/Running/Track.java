package HW5.Running;

public class Track extends Obstacle {

    public Track(String name, int trackLenght) {
        super(name, trackLenght);
    }
    @Override
    public boolean overcome(Member member) {
        return member.getMaxLenght() >= getObstacleTypeSize();
    }
}
