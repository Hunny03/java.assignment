// Q030
package functions;
public class Q030 {
    // password rule: 8+ characters, sirf letter/digit, kam se kam 2 digits
    static boolean passOk(String p){
        if(p.length()<8) return false;
        int d = 0;
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            if(Character.isDigit(c)) d++;
            else if(!Character.isLetter(c)) return false;
        }
        if(d>=2) return true;
        return false;
    }
    public static void main(String[] args) {
        String p[] = {"abc123","Strong99Pass","no_special!1","OnlyLetters","Java2026X"};
        for(int i=0;i<p.length;i++){
            if(passOk(p[i]))
                System.out.println(p[i]+" -> valid");
            else
                System.out.println(p[i]+" -> invalid");
        }
    }
}
