// Q149
package basics;
import java.util.Scanner;
public class Q149 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("x1 y1: ");
        double x1 = kb.nextDouble();
        double y1 = kb.nextDouble();
        System.out.print("x2 y2: ");
        double x2 = kb.nextDouble();
        double y2 = kb.nextDouble();
        double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance = "+d);
    }
}
