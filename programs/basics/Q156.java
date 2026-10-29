// Q156
package basics;
import java.util.Scanner;
public class Q156 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double s = 0;
        for(int i=1;i<=5;i++){
            System.out.print("Number "+i+": ");
            s = s + kb.nextDouble();
        }
        System.out.println("Sum = "+s);
        System.out.println("Average = "+s/5);
    }
}
