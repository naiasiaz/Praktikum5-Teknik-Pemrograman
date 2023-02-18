package w5.testshape;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-14
 */

// Class Square turunan dari class Rectangle
public class Square extends Rectangle{
    // 1st Constructor tanpa parameter
    public Square() {
        super();
    }
    
    // 2nd Constructor dengan satu parameter
    public Square(double side){
        //Memanggil constructor superclass Rectangle dengan parameter side dan side
        super(side, side);
    }
    
    // 3rd Constructor dengan tiga parameter
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    // Method getter
    public double getSide() {
        return super.getWidth();
    }
    
    // Method setter
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    
    // Method getArea()
    @Override
    public double getArea() {
        return getSide()*getSide();
    }
    
    // Method getPerimeter()
    @Override
    public double getPerimeter() {
        return 4*getSide();
    }
    
    // Method setLength() akan mengatur panjang Rectangle dengan panjang sisi yang sama
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    
    // Method setWidth() akan mengatur lebar Rectangle dengan panjang sisi yang sama
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    // Method toString() akan mengembalikan representasi String dari objek Square
    @Override
    public String toString(){
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
