package src.main.java.hillel.hw.running.member;

public class Cat extends Member {
    public Cat(String nameOfMember, double jumpHight, double runLenght) {
        super(nameOfMember, jumpHight, runLenght);
    }
    public void run () {
        System.out.println("Cat " + getNameOfMember() + "run" + getMaxLenght());
    }
    public void jump () {
        System.out.println("Cat " + getNameOfMember () + "jump" + getMaxHight());
    }
}
