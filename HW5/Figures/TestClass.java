package HW5.Figures;

public class TestClass {

    public static void main(String[] args) {
        Area[] array = {new Circle(3.1), new Square(4.4), new Square(7.9), new Triangle(3.5), new Triangle(4.4)};

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].area();
        }

        System.out.println(sum);
    }
}
