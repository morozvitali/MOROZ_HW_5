package HW5.Running;

public class Track extends Obstacle {
    public double obstacleLenght;
    public static int numberObstacle;

    public Track() {
        this.nameObstacle = "Track" + numberObstacle++;
        this.obstacleLenght = Math.random() * 2;
    }

    public boolean overcome(Member member) {
        member.run();

        if (member.getRunLenght() > this.obstacleLenght) {
            System.out.print(this.nameObstacle +  " and I overcome ");
            System.out.println("Run possibility:[ " + Math.round(member.getRunLenght()) + "km ] Track Distance:[ " + Math.round(obstacleLenght) + "km ]");
            return true;
        } else {
            System.out.print(this.nameObstacle + " and I lost and I'm out of the competition!");
            System.out.println("Jump posibility:[ " + Math.round(member.getRunLenght()) + "km ] Wall hight:[ " + Math.round(obstacleLenght) + "km ]");
            return false;
       }
    }
}