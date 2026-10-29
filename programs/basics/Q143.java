// Q143
package basics;
import java.util.Scanner;
public class Q143 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = kb.nextInt();
        long f = 1;
        for(int i=1;i<=n;i++)
            f = f*i;
        System.out.println("Factorial of "+n+" = "+f);
    }
}
