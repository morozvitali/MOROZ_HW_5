package src.main.java.hillel.hw.running.member;

public class Human extends Member {
    public Human (String nameOfMember, double jumpHight, double runLenght) {
        super(nameOfMember, jumpHight, runLenght);
    }
    public void run () {
        System.out.println("Human " + getNameOfMember() + "run" + getMaxLenght());
    }
    public void jump () {
        System.out.println("Human " + getNameOfMember () + "jump" + getMaxHight());
    }
}
