// Q118
package basics;
import java.util.Scanner;
public class Q118 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = kb.nextInt();
        int h = sec/3600;
        int m = (sec%3600)/60;
        int s = sec%60;
        System.out.println(h+" hour "+m+" minute "+s+" second");
    }
}
