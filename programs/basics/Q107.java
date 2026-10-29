// Q107
package basics;
import java.util.Scanner;
public class Q107 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Binary number: ");
        int n = kb.nextInt();
        int dec = 0, p = 1;
        while(n>0){
            int last = n%10;
            dec = dec + last*p;
            p = p*2;
            n = n/10;
        }
        System.out.println("Decimal = "+dec);
    }
}
