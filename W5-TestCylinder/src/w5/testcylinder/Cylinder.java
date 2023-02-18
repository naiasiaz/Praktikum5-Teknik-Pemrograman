package w5.testcylinder;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-14
 */

public class Cylinder extends Circle { // Save as "Cylinder.java" 
    private double height; // private variable 

    // Constructor with default color, radius and height 
    public Cylinder() {
        super();    // call superclass no-arg constructor Circle() 
        height = 1.0; 
    }
    
    // Constructor with default radius, color but given height 
    public Cylinder(double height) { 
        super();    // call superclass no-arg constructor Circle() 
        this.height = height; 
    } 

    // Constructor with default color, but given radius, height 
    public Cylinder(double radius, double height) { 
        super(radius);  // call superclass constructor Circle(r) 
        this.height = height; 
    } 

    // A public method for retrieving the height 
    public double getHeight() { 
        return height;                  // Mengembalikan nilai dari tinggi silinder
    } 

    // A public method for computing the volume of cylinder 
    // use superclass method getArea() to get the base area 
    public double getVolume() {
        return super.getArea()*height;  // Menghitung dan mengembalikan nilai volume silinder berdasarkan rumus luas alas kali tinggi
    }
    
    @Override
    public double getArea() { 
        return 2*Math.PI*super.getRadius()*this.getHeight() + 2*super.getArea(); 
        // Method getArea() di override dalam class Cylinder untuk menghitung dan mengembalikan nilai luas permukaan silinder
    } 
    
    @Override 
    public String toString() { // in Cylinder class 
        return "Cylinder: subclass of " + super.toString() // use Circle's toString() 
                + " height=" + height; 
    }
    
}
