package HW5.Running;

public class Wall extends Obstacle {

    public Wall(String name, int wallHight) {
        super (name, wallHight);
    }

    @Override
    public boolean overcome(Member member) {
        return member.getMaxHight() >= getObstacleTypeSize();
    }
}