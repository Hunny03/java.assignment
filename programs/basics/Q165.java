// Q165
package basics;
import java.util.Scanner;
public class Q165 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        if(a<b && b<c)
            System.out.println("Increasing order");
        else if(a>b && b>c)
            System.out.println("Decreasing order");
        else
            System.out.println("Na increasing na decreasing");
    }
}
