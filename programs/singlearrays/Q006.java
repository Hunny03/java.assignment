// Q006
package singlearrays;
public class Q006 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        System.out.println("In reverse order:");
        for(int i=a.length-1;i>=0;i--)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
