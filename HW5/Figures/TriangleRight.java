package HW5.Figures;

public class TriangleRight implements Area {
    double sizeKatetOne;
    double sizeKatetTwo;
//
//    public TriangleRight(double sizeKatetOne, double sizeKatetTwo) {
//        this.sizeKatetOne = sizeKatetOne;
//        this.sizeKatetTwo = sizeKatetTwo;
//    }
//    public TriangleRight {
//        super;
//
//    }

    @Override
    public double area() {
        double area = sizeKatetOne * sizeKatetTwo / 2;
        return area;
    }
}