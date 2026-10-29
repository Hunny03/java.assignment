// Q350
package conversion;
import java.util.Scanner;
public class Q350 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Octal number: ");
        String s = kb.next();
        int d = Integer.parseInt(s,8);
        System.out.println("Decimal = "+d);
    }
}
