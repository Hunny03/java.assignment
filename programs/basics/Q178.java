// Q178
package basics;
import java.util.Scanner;
public class Q178 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = kb.nextLine();
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
            rev = rev + s.charAt(i);
        System.out.println("Reversed string = "+rev);
    }
}
