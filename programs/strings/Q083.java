// Q083
package strings;
import java.util.Arrays;
public class Q083 {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        char x[] = a.toCharArray();
        char y[] = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y))
            System.out.println("Both strings contain the same characters");
        else
            System.out.println("The strings contain different characters");
    }
}
