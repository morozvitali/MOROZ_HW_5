package HW5.Running;

public class Track extends Obstacle {
    public int trackLenght;

    public Track(String name, int trackLenght) {
        this.nameOfObstacle = name;
        this.trackLenght = trackLenght;
    }

    public boolean overcome(Member member) {

        if (member.getMaxLenght() > this.trackLenght) {
//            System.out.print(  " Учасник "
//                    + member.nameOfMember
//                    + " пройшов перешкоду "
//                    + this.nameOfObstacle
//                    + " на дистанції"
//                    + " ['xxx' це буде рахуватись у тестранінг -"
//                    + "з класу валл не аидно який зараз валл, це назва wall] "); /// сюда прийдет трек
//);
            return true;
        } else {
//            System.out.print(
//                    "Учасник "
//                            + member.nameOfMember
//                            + " не пройшов перешкоду "
//                            + this.nameOfObstacle
//                            + " на дистанції"
//                            + " ['xxx' - це буде рахуватись у тестранінг, це назва wall]"
//                            + " Пройдено [ це теж у тест раннинг, тут буде рахуватись довжина усіх ] "););
            return false;
       }
    }
}