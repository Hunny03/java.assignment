// Q127
package basics;
import java.util.Scanner;
public class Q127 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the length and breadth: ");
        double l = kb.nextDouble();
        double b = kb.nextDouble();
        System.out.println("Rectangle area = "+(l*b));
    }
}
