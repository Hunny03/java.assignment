// Q325
package conversion;
public class Q325 {
    public static void main(String[] args) {
        long l = 384400000L;
        String s = Long.toString(l);
        System.out.println("String = "+s);
        System.out.println("Length = "+s.length());
        System.out.println("Using valueOf = "+String.valueOf(l));
    }
}
