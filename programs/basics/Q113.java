// Q113
package basics;
import java.util.Scanner;
public class Q113 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = kb.nextInt();
        int nn = n*10 + n;
        int nnn = n*100 + n*10 + n;
        int ans = n + nn + nnn;
        System.out.println(n+" + "+nn+" + "+nnn+" = "+ans);
    }
}
