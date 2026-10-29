// Q211
package basics;
import java.util.Scanner;
public class Q211 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = kb.nextInt();
        int flag = 1;
        if(n<2) flag = 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag = 0;
                break;
            }
        }
        if(flag==1)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
    }
}
