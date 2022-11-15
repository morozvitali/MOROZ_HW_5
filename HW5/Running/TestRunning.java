package HW5.Running;

public class TestRunning {


    public static void main(String[] args) {

        Member[] members = {new Cat(), new Cat(), new Human(), new Human(), new Robot(), new Robot(), new Robot()};
        Obstacle[] obstacles = {new Track(), new Wall(), new Wall(), new Wall(), new Track()};

        for (Member member : members)
            for (int a = 0; a < obstacles.length; a++) {
                if (!obstacles[a].overcome(member)) {
                    break;
                } else {
                if (a == (obstacles.length - 1)) {
                        System.out.println("I finish! i run "  + " km");
                    }
                }
            }
        }
    }
