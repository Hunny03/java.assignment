// Q302
package exceptions;
public class Q302 {
    static void vowelCheck(String s) throws Exception {
        s = s.toLowerCase();
        int v = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') v++;
        }
        if(v==0)
            throw new Exception(s+" me vowel nahi hai");
        System.out.println(s+" contains a vowel");
    }
    public static void main(String[] args) {
        String a[] = {"programming","rhythm","sky","orange"};
        for(int i=0;i<a.length;i++){
            try{
                vowelCheck(a[i]);
            }
            catch(Exception e){
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }
}
