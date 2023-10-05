public class Main {
    public static void main(String[] args) {
        // Create a Circle
        Circle circle = new Circle(5.0, "blue", false);

        // Create a Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0, "green", true);

        // Create a Square
        Square square = new Square(3.0, "yellow", true);

        // Display information about the Circle
        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Display information about the Rectangle
        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Display information about the Square
        System.out.println("\nSquare:");
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}