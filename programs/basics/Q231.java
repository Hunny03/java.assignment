// Q231
package basics;
import java.util.Scanner;
public class Q231 {
    static long fact(int n){
        if(n<=1)
            return 1;
        return n*fact(n-1);     // recursion: function khud ko call karta hai
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number: ");
        int n = kb.nextInt();
        System.out.println("Factorial = "+fact(n));
    }
}
