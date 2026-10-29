// Q013
package singlearrays;
public class Q013 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int n = 2;
        for(int k=1;k<=n;k++){
            int last = a[a.length-1];
            for(int i=a.length-1;i>0;i--)
                a[i] = a[i-1];
            a[0] = last;
        }
        System.out.print("After right rotation: ");
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
}
