// Q166
package basics;
import java.util.Scanner;
public class Q166 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the marks for 5 subjects (out of 100): ");
        int tot = 0;
        for(int i=0;i<5;i++)
            tot += kb.nextInt();
        double per = tot/5.0;
        String g;
        if(per>=90) g = "A+";
        else if(per>=80) g = "A";
        else if(per>=70) g = "B";
        else if(per>=60) g = "C";
        else if(per>=40) g = "D";
        else g = "Fail";
        System.out.println("Percentage = "+per);
        System.out.println("Grade = "+g);
    }
}
