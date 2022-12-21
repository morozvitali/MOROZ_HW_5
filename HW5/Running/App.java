package HW5.Running;

public class App { public static void main(String[] args) {

        Member[] members = {new Cat("Flaffy", 4,6),
                            new Cat("Puffy",8,5),
                            new Human("John", 4,4),
                            new Human("James",3,3),
                            new Robot("Optimus",3,4),
                            new Robot("Prime",1,5),
                            new Robot("R2D2",6,6)};
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
