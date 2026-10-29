// Q163
package basics;
import java.util.Scanner;
public class Q163 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Positive number: ");
        int n = kb.nextInt();
        int cnt = 0;
        int t = n;
        while(t>0){
            cnt++;
            t = t/10;
        }
        System.out.println("Digits = "+cnt);
    }
}
