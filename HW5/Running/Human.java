package HW5.Running;

public class Human extends Member {
    public Human () {
        this.maxHight = 2;
        this.maxLenght = 8;
    }

    @Override
    public void run() {
        System.out.printf("i'm Human and i run %d km", maxLenght);
    }

    @Override
    public void jump() {
        System.out.printf("i'm Human and i jump %d m", maxHight);
    }
}