package w5.testshape;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-14
 */

public class Shape {
    // Deklarasi variabel dengan access modifier private
    private String color;
    private boolean filled;
    
    // 1st Constructor tanpa parameter
    public Shape() {
        color = "green";
        filled = true;
    }
    
    // 2nd Constructor dengan dua parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    // Method getter
    public String getColor() {
        return color;
    }
    
    // Method setter
    public void setColor(String color) {
        this.color = color;
    }
    
    // Method getter
    public boolean isFilled() {
        return filled;
    }
    
    // Method setter
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    // Method toString() akan mengembalikan representasi String dari objek Shape
    @Override
    public String toString() {
        String fill = this.filled ? "filled" : "not filled";
        return "A Shape with color of " + color + " and " + fill;
    }
}
