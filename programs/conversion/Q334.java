// Q334
package conversion;
public class Q334 {
    public static void main(String[] args) {
        String s = "Hello";
        Object o = s;      // String khud ek Object hai
        System.out.println("Object = "+o);
        String t = (String) o;   // wapas String me
        System.out.println("Back to string = "+t.toUpperCase());
    }
}
