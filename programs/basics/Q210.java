// Q210
package basics;
import java.util.Scanner;
public class Q210 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many integers will you enter? ");
        int n = kb.nextInt();
        int es = 0, os = 0;
        System.out.print("Now enter the numbers: ");
        for(int i=0;i<n;i++){
            int x = kb.nextInt();
            if(x%2==0) es += x;
            else os += x;
        }
        System.out.println("Sum of even numbers = "+es);
        System.out.println("Sum of odd numbers = "+os);
    }
}
