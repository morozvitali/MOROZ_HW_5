package src.main.java.hillel.hw.Figures;

public class Triangle implements Area {
    private double sizeOne;
    private double sizeTwo;
    private double sizeThree;

    public void setSizeOne(double sizeOne) {
        this.sizeOne = sizeOne;
    }

    public void setSizeTwo(double sizeTwo) {
        this.sizeTwo = sizeTwo;
    }

    public void setSizeThree(double sizeThree) {
        this.sizeThree = sizeThree;
    }

    public double getSizeOne() {
        return sizeOne;
    }

    public double getSizeTwo() {
        return sizeTwo;
    }

    public double getSizeThree() {
        return sizeThree;
    }

    public Triangle(double sizeOne, double sizeTwo, double sizeThree) {
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
        this.sizeThree = sizeThree;
    }

    @Override
    public double area() {
        double perimetr = (sizeOne + sizeTwo + sizeThree) / 2;
        return Math.sqrt(perimetr * (perimetr - sizeOne) * (perimetr - sizeTwo) * (perimetr - sizeThree));
    }
}
