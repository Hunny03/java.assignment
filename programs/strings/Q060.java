// Q060
package strings;
public class Q060 {
    public static void main(String[] args) {
        String s = "programming language";
        System.out.println("Duplicate characters:");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' ') continue;
            int cnt = 1;
            int pehle = 0;
            for(int j=0;j<s.length();j++){
                if(j>i && s.charAt(j)==c) cnt++;
                if(j<i && s.charAt(j)==c) pehle = 1;
            }
            if(cnt>1 && pehle==0)
                System.out.println(c+" -> "+(cnt)+" baar");
        }
    }
}
