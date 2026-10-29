// Q027
package functions;
public class Q027 {
    static int count(String s){
        int c = 0;
        boolean word = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(word==false){
                    c++;
                    word = true;
                }
            }
            else
                word = false;
        }
        return c;
    }
    public static void main(String[] args) {
        String s = "  Methods keep   code   tidy ";
        System.out.println("Words = "+count(s));
    }
}
