// Q170
package basics;
import java.util.Scanner;
public class Q170 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = kb.nextLine();
        System.out.println("Uppercase = "+s.toUpperCase());
    }
}
