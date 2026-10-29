// Q203
package basics;
import java.util.Scanner;
public class Q203 {
    public static void main(String[] args) {
        int a[] = {3,9,14,22,35,41,58,77};
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = kb.nextInt();
        int found = -1;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                found = i;
                break;
            }
        }
        if(found>=0)
            System.out.println(key+" found at index "+found);
        else
            System.out.println(key+" not found");
    }
}
