// Q171
package basics;
import java.util.Scanner;
public class Q171 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String with spaces: ");
        String s = kb.nextLine();
        System.out.println("Before: ["+s+"]");
        System.out.println("After: ["+s.trim()+"]");
    }
}
