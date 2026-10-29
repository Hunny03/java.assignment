// Q124
package basics;
import java.util.Scanner;
public class Q124 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        // + ki jagah bit operators: XOR se add, AND se carry
        while(b!=0){
            int carry = (a&b)<<1;
            a = a^b;
            b = carry;
        }
        System.out.println("Add = "+a);
    }
}
