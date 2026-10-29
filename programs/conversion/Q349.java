// Q349
package conversion;
import java.util.Scanner;
public class Q349 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int n = kb.nextInt();
        System.out.println("Hex = "+Integer.toHexString(n).toUpperCase());
    }
}
