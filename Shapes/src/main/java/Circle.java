public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.radius = radius;
    }

    // Площадь
    public double area() {
        return 3.14 * radius * radius;
    }

    // Периметр (длина окружности)
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}