package HW5.Running;

public class TestRunning {


    public static void main(String[] args) {

        Member[] members = {new Cat(), new Cat(), new Human(), new Human(), new Robot(), new Robot(), new Robot()};
        Obstacle[] obstacles = {new Track("16",4), new Wall("11", 1), new Wall("12",2), new Wall("14",4), new Track("4",4)};

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
