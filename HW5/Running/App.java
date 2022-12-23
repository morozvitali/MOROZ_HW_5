package HW5.Running;

public class App {
    public static void main(String[] args) {

        Member[] members = {
                new Cat("Flaffy", 4, 6),
                new Cat("Puffy", 8, 5),
                new Human("John", 4, 4),
                new Human("James", 3, 3),
                new Robot("Optimus", 3, 4),
                new Robot("Prime", 1, 5),
                new Robot("R2D2", 6, 6)};
        Obstacle[] obstacles = {
                new Track("short", 4),
                new Wall("wall1", 1),
                new Wall("wall2", 2),
                new Wall("wall3", 4),
                new Track("long", 6)};

        for (Member member : members) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(member)) {
                    System.out.println(
                            "Member "
                            + member.getNameOfMember()
                            + " don't get the obstacle "
                            + obstacle.getNameOfObstacle()
                            + " on track "
                            + obstacle.getObstacleTypeSize());
                    break;
                } else {
                    System.out.println("Member "
                            + member.getNameOfMember()
                            + " get the obstacle "
                            + obstacle.getNameOfObstacle()
                            + " on track "
                            + obstacle.getObstacleTypeSize());
                }
            }
        }
    }
}