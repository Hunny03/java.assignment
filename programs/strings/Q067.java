// Q067
package strings;
import java.util.Scanner;
public class Q067 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.next();
        System.out.print("Index: ");
        int i = kb.nextInt();
        if(i>=0 && i<s.length())
            System.out.println("Character = "+s.charAt(i));
        else
            System.out.println("Invalid index");
    }
}
