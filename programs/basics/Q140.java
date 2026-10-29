// Q140
package basics;
import java.util.Scanner;
public class Q140 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many subjects? ");
        int n = kb.nextInt();
        double tot = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Subject "+i+" marks: ");
            tot = tot + kb.nextDouble();
        }
        System.out.println("Average marks = "+(tot/n));
    }
}
