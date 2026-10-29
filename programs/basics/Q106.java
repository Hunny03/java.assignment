// Q106
package basics;
import java.util.Scanner;
public class Q106 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int n = kb.nextInt();
        String bin = "";
        if(n==0) bin = "0";
        while(n>0){
            int r = n%2;
            bin = r + bin;    // remainder ko aage lagate jao
            n = n/2;
        }
        System.out.println("Binary = "+bin);
    }
}
