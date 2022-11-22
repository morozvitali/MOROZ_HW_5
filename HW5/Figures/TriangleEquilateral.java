package HW5.Figures;

public class TriangleEquilateral extends Triangle implements Area {
    double size;

    public TriangleEquilateral(double size) {
        super(size,size,size);
    }
}