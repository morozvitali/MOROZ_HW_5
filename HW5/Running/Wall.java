package HW5.Running;

public class Wall extends Obstacle {
    public double obstacleHight;

    public Wall() {
        this.obstacleHight = Math.random() * 2;
    }


    public boolean overcome(Member member) {
        member.jump();

        if (member.getJumpHight() > this.obstacleHight) {
            System.out.println("i overcome the Wall" + this.obstacleHight);
            return true;
        } else {
            System.out.println("i qweet from track" + this.obstacleHight);
            return false;
        }
    }
}