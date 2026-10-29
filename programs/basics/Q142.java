// Q142
package basics;
import java.util.Scanner;
public class Q142 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = kb.nextInt();
        int s = 0;
        for(int i=1;i<=n;i++)
            s = s + i;
        System.out.println("Sum of the first "+n+" numbers = "+s);
    }
}
