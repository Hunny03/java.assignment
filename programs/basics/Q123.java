// Q123
package basics;
import java.util.Scanner;
public class Q123 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Positive number: ");
        int n = kb.nextInt();
        int copy = n, ulta = 0;
        while(copy>0){
            ulta = ulta*10 + copy%10;
            copy = copy/10;
        }
        if(ulta==n)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }
}
