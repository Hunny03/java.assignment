// Q135
package basics;
import java.util.Scanner;
public class Q135 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the length, width, and height: ");
        double l = kb.nextDouble();
        double w = kb.nextDouble();
        double h = kb.nextDouble();
        System.out.println("Cuboid volume = "+(l*w*h));
    }
}
