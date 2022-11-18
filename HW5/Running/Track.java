package HW5.Running;

public class Track extends Obstacle {
    public int trackLenght;

    public Track(String name, int trackLenght) {
        this.nameOfObstacle = name;
        this.trackLenght = trackLenght;
    }

    public boolean overcome(Member member) {

        if (member.getMaxLenght() > this.trackLenght) {
//            System.out.print(this.nameObstacle +  " and I overcome ");
//            System.out.println("Run possibility:[ " + Math.round(member.getMaxLenght()) + "km ] Track Distance:[ " + Math.round(obstacleLenght) + "km ]");
            return true;
        } else {
//            System.out.print(this.nameObstacle + " and I lost and I'm out of the competition!");
//            System.out.println("Jump posibility:[ " + Math.round(member.getMaxLenght()) + "km ] Wall hight:[ " + Math.round(obstacleLenght) + "km ]");
            return false;
       }
    }
}