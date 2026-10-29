// Q230
package basics;
import java.util.Scanner;
public class Q230 {
    static int gcd(int a, int b){
        while(b!=  0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("2 numbers: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int g = gcd(a ,b);
        int l = (a*b)/g;      // lcm = a*b / gcd
        System.out.println("GCD = "+g);
        System.out.println(" LCM = "+l);
    }
}
