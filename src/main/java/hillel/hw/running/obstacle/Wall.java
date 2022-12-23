package src.main.java.hillel.hw.running.obstacle;

import src.main.java.hillel.hw.running.member.Member;

public class Wall extends Obstacle {

    public Wall(String name, int wallHight) {
        super (name, wallHight);
    }

    @Override
    public boolean overcome(Member member) {
        return member.getMaxHight() >= getObstacleTypeSize();
    }
}