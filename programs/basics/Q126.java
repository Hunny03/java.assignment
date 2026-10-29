// Q126
package basics;
import java.util.Scanner;
public class Q126 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = kb.nextDouble();
        double area = 3.14159*r*r;
        System.out.println("Circle area = "+area);
    }
}
