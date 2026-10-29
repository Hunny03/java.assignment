// Q155
package basics;
import java.util.Scanner;
public class Q155 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int y = kb.nextInt();
        // 4 se divide ho par 100 se nahi, ya phir 400 se ho
        if((y%4==0 && y%100!=0) || y%400==0)
            System.out.println(y+" is a leap year");
        else
            System.out.println(y+" is not a leap year");
    }
}
