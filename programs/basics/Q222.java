// Q222
package basics;
public class Q222 {
    static int vowelCnt(String s){
        int c = 0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        String s = "Education Opens Every Door";
        System.out.println("Vowels = "+vowelCnt(s));
    }
}
