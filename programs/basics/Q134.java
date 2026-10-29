// Q134
package basics;
import java.util.Scanner;
public class Q134 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the radius and height: ");
        double r = kb.nextDouble();
        double h = kb.nextDouble();
        double v = 3.14159*r*r*h;
        System.out.println("Cylinder volume = "+v);
    }
}
