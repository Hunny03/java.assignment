// Q051
package strings;
public class Q051 {
    public static void main(String[] args) {
        String s = "Wait, what? No way! It's (almost) done; really: yes.";
        int c = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // jo letter, digit ya space nahi wo punctuation
            if(!Character.isLetterOrDigit(ch) && ch!=' ')
                c++;
        }
        System.out.println("Punctuation = "+c);
    }
}
