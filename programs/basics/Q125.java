// Q125
package basics;
import java.util.Scanner;
public class Q125 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Positive number: ");
        int n = kb.nextInt();
        int s = 0;
        while(n>0){
            s += n%10;
            n /= 10;
        }
        System.out.println("Sum of all digits = "+s);
    }
}
