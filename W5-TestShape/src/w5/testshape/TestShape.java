package w5.testshape;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-14
 */

public class TestShape {
    public static void main(String[] args) {
        // Membuat Object Shape
        Shape shape = new Shape("red", false);
        System.out.println("Shape : " + "Color = " + shape.getColor() + " Filled = " + shape.isFilled());
        System.out.println(shape.toString() + "\n");
        
        // Membuat Object Circle
        Circle circle = new Circle(5.0, "yellow", true);
        System.out.println("Circle : " + "Area = " + circle.getArea() + " Perimeter = " + circle.getPerimeter());
        System.out.println(circle.toString() + "\n");
        
        // Membuat Object Rectangle
        Rectangle rectangle = new Rectangle(3.0, 5.0, "green", true);
        System.out.println("Rectangle : " + "Area = " + rectangle.getArea() + " Perimeter = " + rectangle.getPerimeter());
        System.out.println(rectangle.toString() + "\n");
        
        // Membuat Object Square
        Square square = new Square(2.0);
        System.out.println("Square : " + "Area = " + square.getArea() + " Perimeter = " + square.getPerimeter());
        System.out.println(square.toString() + "\n");
    }
}
