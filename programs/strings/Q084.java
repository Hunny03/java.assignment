// Q084
package strings;
public class Q084 {
    public static void main(String[] args) {
        String s = "swiss cheese";
        char ans = ' ';
        for(int i=0;i<s.length();i++){
            int c = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)) c++;
            }
            if(c==1){
                ans = s.charAt(i);
                break;
            }
        }
        System.out.println("First non-repeating character = "+ans);
    }
}
