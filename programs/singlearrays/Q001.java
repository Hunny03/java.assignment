// Q001
package singlearrays;
public class Q001 {
    public static void main(String[] args) {
        int a[] = {11,22,33,44,55};
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++)
            b[i] = a[i];      // ek ek karke copy
        System.out.print("Original array: ");
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
        System.out.print("\nCopied array: ");
        for(int i=0;i<b.length;i++) System.out.print(b[i]+" ");
        System.out.println();
    }
}
