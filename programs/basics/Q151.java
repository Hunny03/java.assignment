// Q151
package basics;
import java.util.Scanner;
public class Q151 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int big = a;
        if(b>big) big = b;
        if(c>big) big = c;
        System.out.println("Largest = "+big);
    }
}
