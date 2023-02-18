package w5.testcylinder;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-14
 */

/**
 * The Circle class models a circle with a radius and color. 
 */
public class Circle { // Save as "Circle.java" 
    // private instance variable, not accessible from outside this class 
    private double radius; 
    private String color;
    
    // Constructors (overloaded) 
    /** Constructs a Circle instance with default value for radius and color */ 
    public Circle() { // 1st (default) constructor 
        radius = 1.0; 
        color = "red"; 
    } 
    
    /** Constructs a Circle instance with the given radius and default color */ 
    public Circle(double r) { // 2nd constructor 
        radius = r; 
        color = "red"; 
    } 
    
    public Circle(double r, String color) { // 3rd constructor
        radius = r;
        this.color = color; 
    }
    
    /** Returns the radius */ 
    public double getRadius() { 
        return radius;                  // Mengembalikan nilai dari radius lingkaran
    } 
    
    /** Returns the area of this Circle instance */ 
    public double getArea() { 
        return radius*radius*Math.PI;   // Menghitung dan mengembalikan nilai luas lingkaran
    } 
    
    // Method getter
    public String getColor() {
        return color;                   // Mengembalikan nilai warna lingkaran
    }
    
    // Method setter
    public void setColor(String color) {
        this.color = color;
    }
    
    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */ 
    public String toString() { 
        return "Circle[radius=" + radius + " color=" + color + "]"; 
    } 
}
