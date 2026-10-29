// Q136
package basics;
import java.util.Scanner;
public class Q136 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the radius and height: ");
        double r = kb.nextDouble();
        double h = kb.nextDouble();
        double v = (3.14159*r*r*h)/3;
        System.out.println("Cone volume = "+v);
    }
}
