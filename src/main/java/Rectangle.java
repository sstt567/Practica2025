public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.width = width;
        this.height = height;
    }

    // Площадь
    public double area() {
        return width * height;
    }

    // Периметр
    public double perimeter() {
        return 2 * (width + height);
    }
}