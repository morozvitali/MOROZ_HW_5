package HW5.Running;

public class Robot extends Member{
    public Robot () {
        this.maxHight = 10;
        this.maxLenght = 10;
    }

    @Override
    public void run() {
        System.out.printf("i'm Robot and i run %d km", maxLenght);
    }

    @Override
    public void jump() {
        System.out.printf("i'm Robot and i jump %d m", maxHight);
    }
}
