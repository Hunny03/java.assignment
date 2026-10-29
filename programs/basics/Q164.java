// Q164
package basics;
import java.util.Scanner;
public class Q164 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        if(a==b && b==c)
            System.out.println("All three numbers are equal");
        else
            System.out.println("The three numbers are not equal");
    }
}
