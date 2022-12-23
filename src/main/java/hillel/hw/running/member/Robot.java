package src.main.java.hillel.hw.running.member;

public class Robot extends Member {
    public Robot (String nameOfMember, double jumpHight, double runLenght) {
        super(nameOfMember, jumpHight, runLenght);
    }
    public void run () {
        System.out.println("Robot " + getNameOfMember() + "run" + getMaxLenght());
    }
    public void jump () {
        System.out.println("Robot " + getNameOfMember () + "jump" + getMaxHight());
    }
}