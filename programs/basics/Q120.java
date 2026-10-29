// Q120
package basics;
public class Q120 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = new int[a.length];
        // pehle sab copy karo
        for(int i=0;i<a.length;i++)
            b[i] = a[i];
        // ab pehla aur last swap
        int t = b[0];
        b[0] = b[b.length-1];
        b[b.length-1] = t;
        System.out.print("Original array: ");
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
        System.out.print("\nNew array: ");
        for(int i=0;i<b.length;i++) System.out.print(b[i]+" ");
        System.out.println();
    }
}
