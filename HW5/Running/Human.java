package HW5.Running;

public class Human extends Member {

    public double runLenght;
    public double jumpHight;

    public Human () {
        this.runLenght = Math.random()*10;
        this.jumpHight = Math.random()*2;
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
        System.out.println("i'm Human and i run " + runLenght + " km");
    }

    @Override
    public void jump() {
        System.out.println("i'm Human and i jump " + jumpHight + " m"); }




    }