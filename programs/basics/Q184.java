// Q184
package basics;
import java.util.Scanner;
public class Q184 {
    public static void main(String[] args) {
        String a[] = {"mango","guava","papaya","litchi"};
        Scanner kb = new Scanner(System.in);
        System.out.print("Which fruit should be searched for? ");
        String x = kb.next();
        boolean mila = false;
        for(int i=0;i<a.length;i++){
            if(a[i].equalsIgnoreCase(x))
                mila = true;
        }
        if(mila)
            System.out.println(x+" is in the array");
        else
            System.out.println(x+" is not in the array");
    }
}
