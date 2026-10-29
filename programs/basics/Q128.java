// Q128
package basics;
import java.util.Scanner;
public class Q128 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the base and height: ");
        double b = kb.nextDouble();
        double h = kb.nextDouble();
        double area = 0.5*b*h;
        System.out.println("Triangle area = "+area);
    }
}
