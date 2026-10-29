// Q346
package conversion;
import java.util.Scanner;
public class Q346 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Binary number: ");
        String s = kb.next();
        int d = Integer.parseInt(s,2);
        System.out.println("Decimal = "+d);
        // haath se bhi nikal sakte hai
        int ans = 0;
        for(int i=0;i<s.length();i++)
            ans = ans*2 + (s.charAt(i)-'0');
        System.out.println("Manual conversion = "+ans);
    }
}
