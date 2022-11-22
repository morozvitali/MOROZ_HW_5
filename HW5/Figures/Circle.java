package HW5.Figures;

public class Circle implements Area {
    private double size;



    public Circle(double size) {
        this.size = size;
    }

    @Override
    public double area() {
        double radius = size;
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}