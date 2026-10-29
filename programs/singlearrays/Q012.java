// Q012
package singlearrays;
public class Q012 {
    public static void main(String[] args) {
        int a[] = {250,175,90,310,45};
        int s = 0;
        for(int i=0;i<a.length;i++)
            s = s + a[i];
        System.out.println("Total sum = "+s);
    }
}
