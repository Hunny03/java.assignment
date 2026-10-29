// Q176
package basics;
import java.util.Scanner;
public class Q176 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.next();
        System.out.print("Index: ");
        int idx = kb.nextInt();
        if(idx>=0 && idx<s.length())
            System.out.println("Character = "+s.charAt(idx));
        else
            System.out.println("Index is out of range for the string");
    }
}
