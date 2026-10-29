// Q221
package basics;
public class Q221 {
    static int wordCnt(String s){
        s = s.trim();
        if(s.length()==0) return 0;
        int c = 1;
        for(int i=0;i<s.length();i++){
            // space ke baad naya word shuru hota hai
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        String s = "  Practice makes a programmer perfect ";
        System.out.println("Words = "+wordCnt(s));
    }
}
