// Q212
package basics;
import java.util.Scanner;
public class Q212 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int h = 1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)
                h = i;
        }
        System.out.println("HCF = "+h);
    }
}
