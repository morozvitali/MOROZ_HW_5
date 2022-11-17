package HW5.Running;

public class Wall extends Obstacle {
    public static int numberCreatedObstacle;
    public double obstacleHight;

    public Wall() {
        this.nameObstacle = "Wall" + numberCreatedObstacle++;
        this.obstacleHight = Math.random() * 2;

    }

    public double getObstacleHight() {
        return obstacleHight;
    }

    public boolean overcome(Member member) {
        member.jump();

        if (member.getMaxHight() > this.obstacleHight) {
            System.out.print(this.nameObstacle +  " and I overcome ");
            System.out.println("Jump posibility:[ " + Math.round(member.getMaxHight()) + "m ] Wall hight:[ " + Math.round(obstacleHight) + "m ]");
            return true;
        } else {
            System.out.print(this.nameObstacle + " and I lost and I'm out of the competition!");
            System.out.println("Jump posibility:[ " + Math.round(member.getMaxHight()) + "m ] Wall hight:[ " + Math.round(obstacleHight) + "m ]");
            return false;


        }
    }
}