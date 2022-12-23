package HW5.Running;

public abstract class Obstacle {
    private String nameOfObstacle;
    private double obstacleTypeSize;

    public Obstacle(String name, double obstacleTypeSize) {
        this.nameOfObstacle = name;
        this.obstacleTypeSize = obstacleTypeSize;
    }

    abstract boolean overcome(Member member);

    public String getNameOfObstacle() {
        return nameOfObstacle;
    }

    public void setNameOfObstacle(String nameOfObstacle) {
        this.nameOfObstacle = nameOfObstacle;
    }

    public double getObstacleTypeSize() {
        return obstacleTypeSize;
    }

    public void setObstacleTypeSize() {
        this.obstacleTypeSize = obstacleTypeSize;
    }
}
