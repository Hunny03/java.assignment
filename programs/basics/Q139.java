// Q139
package basics;
import java.util.Scanner;
public class Q139 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Side: ");
        double s = kb.nextDouble();
        System.out.println("Cube surface area = "+(6*s*s));
    }
}
