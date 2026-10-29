// Q233
package basics;
import java.util.Scanner;
public class Q233 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float f = kb.nextFloat();
        System.out.print("Number of decimal places: ");
        int d = kb.nextInt();
        // 10 ki power se multiply karke round kiya fir wapas divide
        double p = Math.pow(10,d);
        double ans = Math.round(f*p)/p;
        System.out.println("Rounded = "+ans);
    }
}
