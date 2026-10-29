// Q133
package basics;
import java.util.Scanner;
public class Q133 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = kb.nextDouble();
        double v = (4.0/3.0)*3.14159*r*r*r;
        System.out.println("Sphere volume = "+v);
    }
}
