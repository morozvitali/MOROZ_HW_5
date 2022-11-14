package HW5.Figures;

public class Triangle implements Area {
    double size;
    public Triangle (double size) {
        this.size = size;
    }

    @Override
    public double area() {
        double side = size;
        double area = Math.pow(side, 2) * Math.sqrt(3) / 4;
        return area;
    }
}