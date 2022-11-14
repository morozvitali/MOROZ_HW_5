package HW5.Running;

public class Track extends Obstacle {
    public double obstacleLenght;

    public Track() {
        this.obstacleLenght = Math.random() * 2;
    }

    public boolean overcome(Member member) {
        member.run();

        if (member.getRunLenght() > this.obstacleLenght) {
            System.out.println("i overcome the Track " + this.obstacleLenght);
            return true;
        } else {
            System.out.println("i qweet from track " + this.obstacleLenght);
            return false;
       }
    }
}