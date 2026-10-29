// Q102
package basics;
import java.util.Scanner;
public class Q102 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        double gun = a*b;
        System.out.println("Product = "+gun);
    }
}
