public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        // Проверка на положительные стороны
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }

        // Проверка неравенства треугольника
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new RuntimeException("There is no figure with such parameters.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Площадь (формула Герона)
    public double area() {
        double p = perimeter() / 2; // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Периметр
    public double perimeter() {
        return a + b + c;
    }
}