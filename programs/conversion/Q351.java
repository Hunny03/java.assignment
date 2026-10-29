// Q351
package conversion;
import java.util.Scanner;
public class Q351 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int n = kb.nextInt();
        System.out.println("Octal = "+Integer.toOctalString(n));
    }
}
