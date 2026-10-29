// Q078
package strings;
public class Q078 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println("Before: a="+a+" b="+b);
        // teesra variable nahi use kiya: pehle jodo fir kaato
        a = a + b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After: a="+a+" b="+b);
    }
}
