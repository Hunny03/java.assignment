// Q112
package basics;
import java.util.Scanner;
public class Q112 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = kb.next().charAt(0);
        int ascii = c;     // char ko int me daalne se ascii aa jata hai
        System.out.println("ASCII value of "+c+" = "+ascii);
    }
}
