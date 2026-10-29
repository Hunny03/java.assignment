// Q073
package strings;
public class Q073 {
    public static void main(String[] args) {
        String s = "  J a v a   is  fun  ";
        String n = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                n = n + s.charAt(i);
        }
        System.out.println("Before: ["+s+"]");
        System.out.println("After: ["+n+"]");
    }
}
