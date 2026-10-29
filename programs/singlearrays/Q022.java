// Q022
package singlearrays;
public class Q022 {
    public static void main(String[] args) {
        int a[] = {12,7,30,45,18,9,64,21};
        System.out.print("Even: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) System.out.print(a[i]+" ");
        }
        System.out.print("\nOdd: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0) System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
