public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }
}
