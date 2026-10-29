// Q044
package strings;
public class Q044 {
    public static void main(String[] args) {
        String s = "Jaa";
        int pos = 2;
        char c = 'v';
        // beech me add karne ke liye string ko do hisse me tod kar jodte hai
        String n = s.substring(0,pos) + c + s.substring(pos);
        System.out.println("Before: "+s);
        System.out.println("After: "+n);
    }
}
