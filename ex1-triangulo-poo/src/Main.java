import entities.Rectangle;
import org.w3c.dom.css.Rect;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println("Area = " + rectangle.Area());
        System.out.println("Perimeter = " + rectangle.Perimeter());
        System.out.println("Diagonal = " + rectangle.Diagonal());
    }
}