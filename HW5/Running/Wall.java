package HW5.Running;

public class Wall extends Obstacle {
    public int wallHight;

    public Wall(String name, int wallHight) {
        this.nameObstacle = name;
        this.wallHight = wallHight;
    }


    public boolean overcome(Member member) {
        member.jump();
        return true;

//        if (member.getMaxHight() > this.wallHight) {
//            System.out.print(this.nameObstacle +  " and I overcome ");
//            System.out.println("Jump posibility:[ " + Math.round(member.getMaxHight()) + "m ] Wall hight:[ " + Math.round(wallHight) + "m ]");
//            return true;
//        } else {
//            System.out.print(this.nameObstacle + " and I lost and I'm out of the competition!");
//            System.out.println("Jump posibility:[ " + Math.round(member.getMaxHight()) + "m ] Wall hight:[ " + Math.round(wallHight) + "m ]");
//            return false;
//
//
//        }
    }
}