// Q103
package basics;
import java.util.Scanner;
public class Q103 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = kb.nextInt();
        int y = kb.nextInt();
        System.out.println("Add = "+(x+y));
        System.out.println("Sub = "+(x-y));
        System.out.println("Mul = "+(x*y));
        // 0 se divide nahi kar sakte
        if(y!=0){
            System.out.println("Div = "+(x/y));
            System.out.println("Remainder = "+(x%y));
        }
        else
            System.out.println("y is zero, so division is not possible");
    }
}
