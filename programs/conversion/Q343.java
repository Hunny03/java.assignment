// Q343
package conversion;
public class Q343 {
    public static void main(String[] args) {
        boolean b = true;
        String s = String.valueOf(b);
        String t = Boolean.toString(false);
        System.out.println(s);
        System.out.println(t);
    }
}
