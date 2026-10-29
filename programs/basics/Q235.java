// Q235
package basics;
public class Q235 {
    public static void main(String[] args) {
        int a = 47, b = 10;
        System.out.println("Normal division = "+(a/b));
        // upar round karne ke liye b-1 add kar dete hai
        int up = (a+b-1)/b;
        System.out.println("Round up division = "+up);
    }
}
