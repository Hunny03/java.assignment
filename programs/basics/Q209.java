// Q209
package basics;
import java.util.Scanner;
public class Q209 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = kb.nextInt();
        int ulta = 0;
        while(n!=0){
            ulta = ulta*10 + n%10;
            n = n/10;
        }
        System.out.println("Reversed number = "+ulta);
    }
}
