// Q348
package conversion;
import java.util.Scanner;
public class Q348 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Hex number: ");
        String s = kb.next();
        int d = Integer.parseInt(s,16);
        System.out.println("Decimal = "+d);
    }
}
