// Q337
package conversion;
public class Q337 {
    public static void main(String[] args) {
        long a = 123456L;
        long b = 5000000000L;
        int x = (int) a;
        int y = (int) b;      // bahut bada hai isliye data loss hoga
        System.out.println("x = "+x);
        System.out.println("y = "+y+" (after type casting)");
    }
}
