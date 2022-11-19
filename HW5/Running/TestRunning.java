package HW5.Running;

public class TestRunning {


    public static void main(String[] args) {

        Member[] members = {new Cat("Flaffy"), new Cat("Puffy"), new Human("John"), new Human("James"), new Robot("Optimus"), new Robot("Prime"), new Robot("R2D2")};
        Obstacle[] obstacles = {new Track("1", 4), new Wall("11", 1), new Wall("12", 2), new Wall("14", 4), new Track("2", 4),new Wall("17", 5), new Wall("13", 2)};

        for (int i = 0; i < members.length; i++) {
            String trackName = null; //назва поточного треку
            int trackRunLenght = 0;

            for (int a = 0; a < obstacles.length; a++) {
                // тут узнаємо що за перешкода,
                // якщо перешкода трек то кажемо що починається трек
                // якщо перешкода стіна то пишемо що спроба подолати стіну,
                // при цьому в памяті тримаємо змінну з назвою треку


                if (obstacles[a] instanceof Track) {
                    System.out.println("Учасник " +
                            members[i].nameOfMember +
                            " починає бігти по треку "
                            + obstacles[a].nameOfObstacle);
                    trackName = obstacles[a].nameOfObstacle; // нова назва поточного трека по якому біжать
                    trackRunLenght += obstacles.length;
                } else {
                    System.out.print("" +
                            "Учасник " +
                            members[i].nameOfMember +
                            " робить спробу подолати перешкоду " +  obstacles[a].nameOfObstacle);



                    if (!obstacles[a].overcome(members[i])) {
                        System.out.println(
                                " Учасник " +
                                members[i].nameOfMember +
                                " не пройшов перешкоду " +
                                obstacles[a].nameOfObstacle +
                                " на дистанції " +
                                trackName +
                                " Пройдено " +
                                members[i].maxLenght +
                                " км," +
                                " учасник вибуває зі змагань");
                        break;
                    } else {

                        System.out.printf(
                                " Учасник "
                                        + members[i].nameOfMember
                                        + " пройшов перешкоду "
                                        + obstacles[a].nameOfObstacle
                                        + " на дистанції");

                        System.out.println(" " + trackName);  // назва поточного треку по якому біжать зараз

                        if (a == (obstacles.length - 1)) {
                            System.out.println(
                                    members[a].nameOfMember +
                                    " пройшов змагання, всього пробігли " +
                                    trackRunLenght
                            );
                        }
                    }
                }
            }
        }
    }
}
