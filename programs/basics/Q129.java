// Q129
package basics;
import java.util.Scanner;
public class Q129 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Side: ");
        double s = kb.nextDouble();
        double area = (Math.sqrt(3)/4)*s*s;
        System.out.println("Equilateral triangle area = "+area);
    }
}
