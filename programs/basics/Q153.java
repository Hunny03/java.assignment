// Q153
package basics;
import java.util.Scanner;
public class Q153 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = kb.nextDouble();
        if(n>0)
            System.out.println("Positive");
        else if(n<0)
            System.out.println("Negative");
        else
            System.out.println("It is zero");
    }
}
