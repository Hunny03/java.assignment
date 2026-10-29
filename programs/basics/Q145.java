// Q145
package basics;
import java.util.Scanner;
public class Q145 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the CGPA (out of 10): ");
        double cg = kb.nextDouble();
        double per = cg*9.5;     // percentage = CGPA x 9.5
        System.out.println("Percentage = "+per+"%");
    }
}
