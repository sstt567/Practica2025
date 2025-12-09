import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какая фигура?");
        System.out.println("1 - Прямоугольник");
        System.out.println("2 - Круг");
        System.out.println("3 - Треугольник");

        int choice = scanner.nextInt();

        if (choice == 1) {
            // Прямоугольник
            System.out.print("Ширина: ");
            double w = scanner.nextDouble();
            System.out.print("Высота: ");
            double h = scanner.nextDouble();

            try {
                Rectangle r = new Rectangle(w, h);
                System.out.println("Площадь: " + r.area());
                System.out.println("Периметр: " + r.perimeter());
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        } else if (choice == 2) {
            // Круг
            System.out.print("Радиус: ");
            double r = scanner.nextDouble();

            try {
                Circle c = new Circle(r);
                System.out.println("Площадь: " + c.area());
                System.out.println("Периметр: " + c.perimeter());
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        } else if (choice == 3) {
            // Треугольник
            System.out.print("Сторона A: ");
            double a = scanner.nextDouble();
            System.out.print("Сторона B: ");
            double b = scanner.nextDouble();
            System.out.print("Сторона C: ");
            double c = scanner.nextDouble();

            try {
                Triangle t = new Triangle(a, b, c);
                System.out.println("Площадь: " + t.area());
                System.out.println("Периметр: " + t.perimeter());
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        } else {
            System.out.println("Неверный выбор!");
        }

        scanner.close();
    }
}
