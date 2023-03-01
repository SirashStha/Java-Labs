package lab11;

public class Rectangle implements Shape{
    private double area;
    private double perimeter;

    @Override
    public double area(double x, double y) {
        area = x * y;
        return area;
    }

    @Override
    public double perimeter(double x, double y) {
        perimeter = 2 * (x + y);
        return perimeter;
    }
}
