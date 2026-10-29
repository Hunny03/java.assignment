// Q079
package strings;
public class Q079 {
    public static void main(String[] args) {
        String s = "abcdefg";
        char c[] = s.toCharArray();
        for(int i=0;i+1<c.length;i=i+2){
            char t = c[i];
            c[i] = c[i+1];
            c[i+1] = t;
        }
        System.out.println("Before: "+s);
        System.out.println("After: "+new String(c));
    }
}
