// Q218
package basics;
import java.util.Scanner;
public class Q218 {
    public static void main(String[] args) {
        // series question me di nahi hai isliye 1 + 1/2 + 1/3 + ... + 1/n li hai
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = kb.nextInt();
        double s = 0;
        for(int i=1;i<=n;i++)
            s = s + 1.0/i;
        System.out.println("Series sum = "+s);
    }
}
