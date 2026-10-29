// Q008
package singlearrays;
public class Q008 {
    public static void main(String[] args) {
        int a[] = {15,25,35,45,55,65};
        // odd position = index 0,2,4
        System.out.print("Elements at odd positions: ");
        for(int i=0;i<a.length;i=i+2)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
