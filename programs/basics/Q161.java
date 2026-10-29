// Q161
package basics;
import java.util.Scanner;
public class Q161 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = kb.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+" x "+i+" = "+n*i);
    }
}
