package HW5.Running;

public class TestRunning {


    public static void main(String[] args) {

        Member[] members = {new Cat(), new Cat(), new Human(), new Human(), new Robot(), new Robot(), new Robot()};
        Obstacle[] obstacles = {new Track(), new Wall(), new Wall(), new Wall(), new Track()};

        for (int i = 0; i < members.length; i++) {

            for (int a = 0; a < obstacles.length; a++) {

                if (!obstacles[a].overcome(members[i])) {
                    break;

                }else if (a==(obstacles.length-1)) {
                    System.out.println(" i finish Obstracle! " );
                }
            }
        }
    }
}
