// Q197
package basics;
public class Q197 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int last = a[a.length-1];
        for(int i=a.length-1;i>0;i--)
            a[i] = a[i-1];
        a[0] = last;
        System.out.print("After rotation: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
