package HW5.Running;

public class Cat extends Member {
    public static int nameQuantity;
    public double runLenght;
    public double jumpHight;

    public Cat() {
        this.name = "Cat" + nameQuantity++;
        this.runLenght = Math.random() * 2;
        this.jumpHight = Math.random() * 10;

    }

    @Override
    public double getRunLenght() {
        return runLenght;
    }

    @Override
    public double getJumpHight() {
        return jumpHight;
    }
}

