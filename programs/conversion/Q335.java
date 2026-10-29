// Q335
package conversion;
public class Q335 {
    public static void main(String[] args) {
        Object o1 = 55;
        Object o2 = 2.5;
        Object o3 = true;
        String s1 = o1.toString();
        String s2 = String.valueOf(o2);
        String s3 = o3.toString();
        System.out.println(s1+" "+s2+" "+s3);
    }
}
