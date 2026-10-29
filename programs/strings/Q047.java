// Q047
package strings;
public class Q047 {
    enum Din { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }
    public static void main(String[] args) {
        Din d = Din.WEDNESDAY;
        String s = d.toString();
        System.out.println("String from enum: "+s);
        System.out.println("All days:");
        for(Din x : Din.values())
            System.out.println(x);
    }
}
