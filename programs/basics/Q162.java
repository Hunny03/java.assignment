// Q162
package basics;
import java.util.Scanner;
public class Q162 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = kb.nextInt();
        if(n<0) System.out.println("Negative");
        else if(n==0) System.out.println("Zero");
        else System.out.println("Positive");
    }
}
