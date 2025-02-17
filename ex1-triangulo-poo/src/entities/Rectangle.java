package entities;
import static java.lang.Math.sqrt;

public class Rectangle {
    public double width;
    public double height;

    public double Area() {
        return width * height;
    }
    public double Perimeter() {
        return (width*2) + (height*2);
    }
    public double Diagonal() {
        return sqrt((width*width) + (height*height));
    }
}
