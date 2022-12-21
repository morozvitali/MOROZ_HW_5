package HW5.Running;

public abstract class Obstacle {
    protected String nameOfObstacle;

    public Obstacle(String name, int wallHight) {
        this.nameOfObstacle = name;

    }

    abstract boolean overcome(Member member);

    public String getNameOfObstacle () {
        return nameOfObstacle;
    }
    public void setNameOfObstacle (String nameOfObstacle) {
        this.nameOfObstacle = nameOfObstacle;
    }
}
