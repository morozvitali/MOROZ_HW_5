package HW5.Running;

public class Cat extends Member {
    public Cat(String nameOfMember) {
        this.nameOfMember = nameOfMember;
        this.maxHight = 8;
        this.maxLenght = 4;
    }

    @Override
    public void run() {
        System.out.printf("i'm Cat and i run %d km", maxLenght);
    }

    @Override
    public void jump() {
        System.out.printf("i'm Cat and i jump %d m", maxHight);
    }
}
