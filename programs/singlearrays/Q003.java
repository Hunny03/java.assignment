// Q003
package singlearrays;
public class Q003 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int n = 2;       // kitni baar rotate karna hai
        for(int k=1;k<=n;k++){
            int first = a[0];
            for(int i=0;i<a.length-1;i++)
                a[i] = a[i+1];
            a[a.length-1] = first;
        }
        System.out.print("After left rotation: ");
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
}
