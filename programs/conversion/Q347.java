// Q347
package conversion;
import java.util.Scanner;
public class Q347 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int n = kb.nextInt();
        System.out.println("Binary = "+Integer.toBinaryString(n));
        String b = "";
        while(n>0){
            b = (n%2) + b;
            n = n/2;
        }
        System.out.println("Manual conversion = "+b);
    }
}
