// Q122
package basics;
import java.util.Scanner;
public class Q122 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = kb.nextInt();
        double r = Math.sqrt(n);
        System.out.println("Square root = "+r);
    }
}
