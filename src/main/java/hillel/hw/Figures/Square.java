package src.main.java.hillel.hw.Figures;

public class Square implements Area {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double area() {
        return size * size;
    }
}
