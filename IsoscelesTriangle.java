public class IsoscelesTriangle extends Triangle {
    private double base;
    private double side;

    public IsoscelesTriangle(double base, double side) {
        this.base = base;
        this.side = side;
    }

    @Override
    public double area() {
        double height = Math.sqrt(side * side - (base * base / 4));
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return 2 * side + base;
    }
}
