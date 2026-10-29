// Q150
package basics;
import java.util.Scanner;
public class Q150 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the base and exponent: ");
        double b = kb.nextDouble();
        int p = kb.nextInt();
        double ans = 1;
        for(int i=1;i<=p;i++)
            ans = ans*b;
        System.out.println(b+" raised to the power of "+p+" = "+ans);
    }
}
