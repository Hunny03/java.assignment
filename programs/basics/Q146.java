// Q146
package basics;
import java.util.Scanner;
public class Q146 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the principal, rate, compounding frequency per year, and number of years: ");
        double p = kb.nextDouble();
        double r = kb.nextDouble();
        int n = kb.nextInt();
        double t = kb.nextDouble();
        double amt = p * Math.pow(1 + r/(100*n), n*t);
        double ci = amt - p;
        System.out.println("Total amount = "+amt);
        System.out.println("Compound interest = "+ci);
    }
}
