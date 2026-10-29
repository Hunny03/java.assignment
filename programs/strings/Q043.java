// Q043
package strings;
public class Q043 {
    public static void main(String[] args) {
        String s = "Jav";
        char c = 'a';
        s = s + c;           // peeche add
        System.out.println("Added at the beginning: "+s);
        String t = "ava";
        t = 'J' + t;         // aage add
        System.out.println("Added at the end: "+t);
    }
}
