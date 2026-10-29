// Q138
package basics;
import java.util.Scanner;
public class Q138 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the radius and height: ");
        double r = kb.nextDouble();
        double h = kb.nextDouble();
        double sa = 2*3.14159*r*(r+h);
        System.out.println("Cylinder surface area = "+sa);
    }
}
