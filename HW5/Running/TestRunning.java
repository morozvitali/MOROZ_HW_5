package HW5.Running;

public class TestRunning {


    public static void main(String[] args) {

        Member[] members = {new Cat("Flaffy"), new Cat("Puffy"), new Human("John"), new Human("James"), new Robot("Optimus"), new Robot("Prime"), new Robot("R2D2")};
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
