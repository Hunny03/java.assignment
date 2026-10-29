// Q326
package conversion;
public class Q326 {
    public static void main(String[] args) {
        String s = "249.75";
        float f = Float.parseFloat(s);
        System.out.println("float = "+f);
        System.out.println("Price after a 10% discount = "+f*0.9f);
    }
}
