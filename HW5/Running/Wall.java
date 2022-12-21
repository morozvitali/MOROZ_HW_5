package HW5.Running;

public class Wall extends Obstacle {
    public int wallHight;

    public Wall(String name, int wallHight) {
        this.nameOfObstacle = name;
        this.wallHight = wallHight;
    }

    public boolean overcome(Member member) {

        if (member.getMaxHight() > this.wallHight) {
            System.out.printf(
                    "Учасник "
                    + member.nameOfMember
                    + "пройшов перешкоду "
                    + this.nameOfObstacle
                    + "на дистанції "
                    + "[xxx]"); /// сюда прийдет трек

            return true;
        } else {
            System.out.println(
                    "Учасник "
                    + member.nameOfMember
                    + " не пройшов перешкоду "
                    + this.nameOfObstacle
                    + "на дистанції "
                    + "[xxx]" /// сюда прийдет трек
                    + "Пройдено[ЗНАЧЕНИЕ]"); // кількість пройденої дистанції

            // ідея все скинути у Обстейкл, коли будуть зьявлятися перешкоди то
            // оброблятися буде все там в залежності від того що прийшло на слідуючий
            // цикл масиву

            // висоти прижків не буде, буде просто дистанція і перешкоди, треба бігти

            return false;
        }
    }
}