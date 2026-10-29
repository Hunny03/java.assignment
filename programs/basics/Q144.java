// Q144
package basics;
import java.util.Scanner;
public class Q144 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of units used: ");
        int u = kb.nextInt();
        double bill;
        // slab: 100 tak Rs3, next 100 Rs5, next 100 Rs7, uske baad Rs10
        if(u<=100)
            bill = u*3;
        else if(u<=200)
            bill = 100*3 + (u-100)*5;
        else if(u<=300)
            bill = 100*3 + 100*5 + (u-200)*7;
        else
            bill = 100*3 + 100*5 + 100*7 + (u-300)*10;
        System.out.println("Bill = Rs "+bill);
    }
}
