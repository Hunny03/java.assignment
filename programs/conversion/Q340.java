// Q340
package conversion;
public class Q340 {
    public static void main(String[] args) {
        char c = 'k';
        int a = c;
        System.out.println("Integer value of 'k' = "+a);
        char d = '7';
        int b = d - '0';       // digit char ko asli number banane ke liye
        System.out.println("Numeric value of '7' = "+b);
    }
}
