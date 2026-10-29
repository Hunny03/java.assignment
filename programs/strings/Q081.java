// Q081
package strings;
import java.util.Scanner;
public class Q081 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        char c[] = s.toCharArray();
        int i = 0, j = c.length-1;
        while(i<j){
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
        System.out.println("Reverse = "+new String(c));
    }
}
