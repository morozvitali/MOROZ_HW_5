package src.main.java.hillel.hw.running.obstacle;

import src.main.java.hillel.hw.running.member.Member;

public class Track extends Obstacle {

    public Track(String name, int trackLenght) {
        super(name, trackLenght);
    }
    @Override
    public boolean overcome(Member member) {
        return member.getMaxLenght() >= getObstacleTypeSize();
    }
}
