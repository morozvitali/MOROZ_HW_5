package HW5.Running;

public class Cat extends Member {

    public double runLenght;
    public double jumpHight;

    public Cat() {
        this.runLenght = Math.random()*2;
        this.jumpHight = Math.random()*10;
    }

    @Override
    public double getRunLenght() {
        return runLenght;
    }

    @Override
    public double getJumpHight() {
        return jumpHight;
    }

    @Override
    public void run() {
        System.out.println("i'm Cat and i run " + runLenght + " km");
    }

    @Override
    public void jump() {
        System.out.println("i'm Cat and i jump " + jumpHight + " m");
    }
}
