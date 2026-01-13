import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select figure: 1-Rectangle, 2-Circle, 3-Triangle");
        int choice = scanner.nextInt();

        try {
            if (choice == 1) {
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                Rectangle rect = new Rectangle(width, height);
                System.out.println("Area: " + rect.getArea());
                System.out.println("Perimeter: " + rect.getPerimeter());

            } else if (choice == 2) {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Perimeter: " + circle.getPerimeter());

            } else if (choice == 3) {
                System.out.print("Side A: ");
                double a = scanner.nextDouble();
                System.out.print("Side B: ");
                double b = scanner.nextDouble();
                System.out.print("Side C: ");
                double c = scanner.nextDouble();
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
            }
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
