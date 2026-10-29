// Q301
package exceptions;
import java.util.Scanner;
public class Q301 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = kb.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the numbers: ");
        try{
            for(int i=0;i<n;i++){
                a[i] = kb.nextInt();
                for(int j=0;j<i;j++){
                    if(a[j]==a[i])
                        throw new Exception("Duplicate number: "+a[i]);
                }
            }
            System.out.println("No duplicates found");
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
