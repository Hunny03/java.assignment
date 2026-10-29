// Q232
package basics;
import java.util.Scanner;
public class Q232 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Integer: ");
        int n = kb.nextInt();
        int ulta = 0;
        while(n!=0){
            int r = n%10;
            ulta = ulta*10 + r;
            n = n/10;
        }
        System.out.println("Reverse = "+ulta);
    }
}
