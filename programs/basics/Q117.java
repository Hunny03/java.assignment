// Q117
package basics;
import java.util.Scanner;
public class Q117 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number as a string: ");
        String s = kb.next();
        int n = Integer.parseInt(s);
        System.out.println("Integer = "+n);
        System.out.println("n + 10 = "+(n+10));
    }
}
