// Q075
package strings;
import java.util.Scanner;
public class Q075 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        System.out.print("What should replace the spaces? ");
        char c = kb.next().charAt(0);
        System.out.println("Result = "+s.replace(' ',c));
    }
}
