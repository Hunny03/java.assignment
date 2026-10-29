// Q183
package basics;
public class Q183 {
    public static void main(String[] args) {
        double a[] = {31.5,29.0,33.2,35.8,30.4};
        double s = 0;
        for(int i=0;i<a.length;i++)
            s += a[i];
        System.out.println("Average = "+s/a.length);
    }
}
