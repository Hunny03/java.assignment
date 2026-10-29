// Q147
package basics;
import java.util.Scanner;
public class Q147 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the total runs and number of dismissals: ");
        int runs = kb.nextInt();
        int out = kb.nextInt();
        if(out==0)
            System.out.println("No dismissals were recorded, so the average cannot be calculated");
        else{
            double avg = (double)runs/out;
            System.out.println("Batting average = "+avg);
        }
    }
}
