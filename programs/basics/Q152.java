// Q152
package basics;
import java.util.Scanner;
public class Q152 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the month number and year: ");
        int m = kb.nextInt();
        int y = kb.nextInt();
        int days = 0;
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if((y%4==0 && y%100!=0) || y%400==0)
                    days = 29;
                else
                    days = 28;
                break;
            default:
                System.out.println("Invalid month");
        }
        if(days!=0)
            System.out.println("Days = "+days);
    }
}
