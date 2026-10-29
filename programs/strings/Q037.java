// Q037
package strings;
public class Q037 {
    static boolean num(String s){
        if(s.length()==0) return false;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s[] = {"20260930","12a45","","007"};
        for(int i=0;i<s.length;i++)
            System.out.println("\""+s[i]+"\" -> "+num(s[i]));
    }
}
