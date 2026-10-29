// Q217
package basics;
import java.util.Scanner;
public class Q217 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many terms? ");
        int n = kb.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
