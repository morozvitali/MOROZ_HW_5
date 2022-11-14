package HW5.Running;


public class Robot extends Member{

    double runLenght;
    double jumpHight;

    public Robot() {
    this.runLenght = Math.random()*10;
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
        System.out.println("i'm Robot and i run " + runLenght + " km");
    }

    @Override
    public void jump() {
        System.out.println("i'm Robot and i jump " + jumpHight + " m"); }
}
