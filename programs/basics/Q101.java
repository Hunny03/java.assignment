// Q101
package basics;
import java.util.Scanner;
public class Q101 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("First number: ");
        int a = kb.nextInt();
        System.out.print("Second number: ");
        int b = kb.nextInt();
        int jod = a+b;
        System.out.println("Sum = "+jod);
    }
}
