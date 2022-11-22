package HW5.Figures;

public class Square implements Area {
    private double size;


    public Square (double size) {
        this.size = size;
    }

    @Override
    public double area() {
        double side = size;
        double area = Math.pow(side, 2);
        return area;
    }
}
