// Q080
package strings;
import java.util.Scanner;
public class Q080 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("First string: ");
        String a = kb.nextLine();
        System.out.print("Second string: ");
        String b = kb.nextLine();
        if(a.contains(b))
            System.out.println("The second string is contained in the first");
        else
            System.out.println("Not found");
    }
}
