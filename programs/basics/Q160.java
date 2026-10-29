// Q160
package basics;
import java.util.Scanner;
public class Q160 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many odd numbers? ");
        int n = kb.nextInt();
        int s = 0;
        System.out.println("Odd numbers:");
        for(int i=1;i<=n;i++){
            int od = 2*i-1;
            System.out.print(od+" ");
            s = s + od;
        }
        System.out.println("\nUnka sum = "+s);
    }
}
