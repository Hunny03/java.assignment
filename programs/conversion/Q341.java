// Q341
package conversion;
public class Q341 {
    public static void main(String[] args) {
        int n = 74;
        char c = (char) n;
        System.out.println("Character for 74 = "+c);
        int d = 5;
        char e = (char)(d+'0');
        System.out.println("Character for 5 = "+e);
    }
}
