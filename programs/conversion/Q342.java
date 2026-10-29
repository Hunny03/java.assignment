// Q342
package conversion;
public class Q342 {
    public static void main(String[] args) {
        String s = "true";
        boolean b = Boolean.parseBoolean(s);
        System.out.println("true -> "+b);
        System.out.println("TRUE -> "+Boolean.parseBoolean("TRUE"));
        System.out.println("yes -> "+Boolean.parseBoolean("yes"));
    }
}
