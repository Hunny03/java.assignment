// Q110
package basics;
import java.util.Scanner;
public class Q110 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        if(a>b)
            System.out.println(a+" is greater than "+b);
        else if(a<b)
            System.out.println(a+" is less than "+b);
        else
            System.out.println("Both numbers are equal");
    }
}
