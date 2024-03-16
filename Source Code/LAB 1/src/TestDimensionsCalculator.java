// 1)
public class TestDimensionsCalculator {
    public static void main(String[] args) {
        DimensionsCalculator rectangle = new DimensionsCalculator();
        DimensionsCalculator square = new DimensionsCalculator();
        DimensionsCalculator circle = new DimensionsCalculator();
        rectangle.setWidthAndHeight(4, 5.5);
        square.setSideLength(10);
        circle.setRadius(3.2);
        System.out.println("Area of Rectangle = " + rectangle.getRectangleArea());
        System.out.println("Perimeter of Rectangle = " + rectangle.getRectanglePerimeter());
        System.out.println("Area of Square = " + square.getSquareArea());
        System.out.println("Perimeter of Square = " + square.getSquarePerimeter());
        System.out.println("Area of Circle = " + circle.getCircleArea());
        System.out.println("Perimeter of Circle = " + circle.getCirclePerimeter());
    }
}

class DimensionsCalculator {
    final double PI = 3.14159265359;
    private double width, height, radius;

    //Setters
    public void setWidthAndHeight(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setSideLength(double sideLength) {
        this.width = sideLength;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Getters
    public double getRectangleArea() {
        return width * height;
    }

    public double getSquareArea() {
        return width * width;
    }

    public double getCircleArea() {
        return PI * radius * radius;
    }

    public double getRectanglePerimeter() {
        return 2 * (width + height);
    }

    public double getSquarePerimeter() {
        return 4 * width;
    }

    public double getCirclePerimeter() {
        return 2 * PI * radius;
    }
}
