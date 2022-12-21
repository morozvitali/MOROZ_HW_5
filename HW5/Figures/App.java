package HW5.Figures;

public class App {
    public static void main(String[] args) {
        Area[] array = {new Circle(3.1), new Square(4.4), new Square(7.9), new Triangle(3, 2, 2)};
        System.out.println(sumCalc(array));
    }

    public static double sumCalc(Area[] array) {
        double sum = 0;
        for (Area area : array) {
            sum += area.area();
            System.out.println(area.area());
        }
        return sum;
    }
}