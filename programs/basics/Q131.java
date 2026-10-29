// Q131
package basics;
import java.util.Scanner;
public class Q131 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the base and height: ");
        double b = kb.nextDouble();
        double h = kb.nextDouble();
        System.out.println("Parallelogram area = "+(b*h));
    }
}
