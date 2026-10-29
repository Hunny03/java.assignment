// Q038
package strings;
public class Q038 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String(a);    // naya object bana (deep copy)
        String c = a;                // sirf reference copy
        System.out.println("a == c : "+(a==c));
        System.out.println("a == b : "+(a==b));
        System.out.println("a.equals(b) : "+a.equals(b));
    }
}
