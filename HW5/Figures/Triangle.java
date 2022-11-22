package HW5.Figures;

public class Triangle implements Area {
    private double sizeOne;
    private double sizeTwo;
    private double sizeThree;

    public Triangle (double sizeOne, double sizeTwo, double sizeThree) {
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
        this.sizeThree = sizeThree;
    }

    @Override
    public double area() {
        double perimetr = (sizeOne + sizeTwo + sizeThree)/2;
        double area = Math.sqrt(perimetr*(perimetr-sizeOne)*(perimetr-sizeTwo)*(perimetr-sizeThree));
        return area;
    }
}