// Q236
package basics;
import java.util.Scanner;
public class Q236 {
    static int val(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        if(c=='M') return 1000;
        return 0;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Roman number: ");
        String s = kb.next();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int cur = val(s.charAt(i));
            // agla bada ho to ghatate hai (IV = 4)
            if(i+1<s.length() && cur<val(s.charAt(i+1)))
                ans = ans - cur;
            else
                ans = ans + cur;
        }
        System.out.println("Integer = "+ans);
    }
}
