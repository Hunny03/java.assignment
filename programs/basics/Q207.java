// Q207
package basics;
import java.util.Scanner;
public class Q207 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = kb.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }
    }
}
