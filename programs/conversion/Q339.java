// Q339
package conversion;
public class Q339 {
    public static void main(String[] args) {
        double d = 98.76;
        int a = (int) d;                 // decimal kat jata hai
        int b = (int) Math.round(d);     // round hota hai
        System.out.println("Using cast = "+a);
        System.out.println("After rounding = "+b);
    }
}
