// Q036
package functions;
public class Q036 {
    static boolean vowel(String s){
        if(s.length()==0) return false;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("aeiou   "+vowel("aeiou"));
        System.out.println("AEIOUa "+vowel("AEIOUa"));
        System.out.println("vowel    "+vowel("vowel"));
    }
}
