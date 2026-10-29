// Q105
package basics;
import java.util.Scanner;
public class Q105 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println("Before: a="+a+" b="+b);
        int t = a;   // teesra variable lekar swap
        a = b;
        b = t;
        System.out.println("After: a="+a+" b="+b);
    }
}
