// Q227
package basics;
import java.util.Scanner;
public class Q227 {
    static boolean even(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number: ");
        int n = kb.nextInt();
        if(even(  n))
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");
    }
}
