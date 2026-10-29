// Q062
package strings;
public class Q062 {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println("Frequency of characters:");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' ') continue;
            int pehle = 0, cnt = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    cnt++;
                    if(j<i) pehle = 1;
                }
            }
            if(pehle==0)
                System.out.println(c+" = "+cnt);
        }
    }
}
