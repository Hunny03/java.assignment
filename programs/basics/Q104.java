// Q104
package basics;
import java.util.Scanner;
public class Q104 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int tot = 0;
        System.out.println("Enter five numbers:");
        for(int i=1;i<=5;i++){
            int n = kb.nextInt();
            tot = tot + n;
        }
        double avg = tot/5.0;
        System.out.println("Average = "+avg);
    }
}
