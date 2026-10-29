// Q007
package singlearrays;
public class Q007 {
    public static void main(String[] args) {
        int a[] = {15,25,35,45,55,65};
        // position 1 se ginte hai isliye even position = index 1,3,5
        System.out.print("Elements at even positions: ");
        for(int i=1;i<a.length;i=i+2)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
