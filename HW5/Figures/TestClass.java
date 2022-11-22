package HW5.Figures;

public class TestClass {

//
//    Коли я бачу клас трикутника,то я очікую, ще це якийсь загальний клас для будь-якого трикутника з трьома сторонами,
//    тому і очікую що можу заадати усі три сторони. Для окремих випадків (напр. прямокутний , рівнобедрений або
//    рівносторонній трикутник створювати окремих наслідників)






    public static void main(String[] args) {
        Area[] array = {new Circle(3.1), new Square(4.4), new Square(7.9), new Triangle(3,2,2)};

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].area();
            System.out.println(array[i].area());
        }

        System.out.println(sum);
    }
}
