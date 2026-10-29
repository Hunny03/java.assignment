// Q186
package basics;
import java.util.Scanner;
public class Q186 {
    public static void main(String[] args) {
        int a[] = {5,10,15,20,25};
        Scanner kb = new Scanner(System.in);
        System.out.print("What should be inserted, and at which position? ");
        int x = kb.nextInt();
        int p = kb.nextInt();
        // array ka size fix hota hai isliye bada array banaya
        int b[] = new int[a.length+1];
        int j = 0;
        for(int i=0;i<b.length;i++){
            if(i==p)
                b[i] = x;
            else{
                b[i] = a[j];
                j++;
            }
        }
        System.out.print("New array: ");
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
        System.out.println();
    }
}
