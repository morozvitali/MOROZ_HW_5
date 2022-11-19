package HW5.Running;

public class Wall extends Obstacle {
    public int wallHight;

    public Wall(String name, int wallHight) {
        this.nameOfObstacle = name;
        this.wallHight = wallHight;
    }

    public boolean overcome(Member member) {

        if (member.getMaxHight() > this.wallHight) {
//            System.out.printf(
//                    " Учасник "
//                    + member.nameOfMember
//                    + " пройшов перешкоду "
//                    + this.nameOfObstacle
//                    + " на дистанції"); /// сюда прийдет трек

            return true;
        } else {
           // System.out.println(
                  //  " Учасник "
                  //  + member.nameOfMember
                  //  + " не пройшов перешкоду "
                  //  + this.nameOfObstacle
                  //          + " на дистанції");
            return false;
        }
    }
}