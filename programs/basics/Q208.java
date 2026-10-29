// Q208
package basics;
import java.util.Scanner;
public class Q208 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = kb.nextInt();
        long f = 1;
        int i = n;
        while(i>1){
            f = f*i;
            i--;
        }
        System.out.println("Factorial = "+f);
    }
}
