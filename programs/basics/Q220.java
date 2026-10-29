// Q220
package basics;
public class Q220 {
    static int chota(int a, int b, int c){
        int m = a;
        if(b<m) m = b;
        if(c<m) m = c;
        return m;
    }
    public static void main(String[] args) {
        System.out.println("Smallest among 48, 19, and 33 = "+chota(48,19,33));
    }
}
