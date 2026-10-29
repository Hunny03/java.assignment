// Q040
package strings;
import java.util.Scanner;
public class Q040 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        System.out.print("Which character should be removed? ");
        char c = kb.next().charAt(0);
        String n = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c)
                n = n+s.charAt(i);
        }
        System.out.println("Result = "+n);
    }
}
