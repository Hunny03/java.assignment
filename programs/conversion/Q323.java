// Q323
package conversion;
public class Q323 {
    public static void main(String[] args) {
        int n = 450;
        String a = String.valueOf(n);
        String b = Integer.toString(n);
        String c = ""+n;
        System.out.println(a+" "+b+" "+c);
        System.out.println("String length = "+a.length());
    }
}
