// Q026
package functions;
public class Q026 {
    static String beech(String s){
        int n = s.length();
        // odd length me ek middle, even me do middle character aate hai
        if(n%2==1)
            return s.substring(n/2, n/2+1);
        else
            return s.substring(n/2-1, n/2+1);
    }
    public static void main(String[] args) {
        System.out.println("Python -> "+beech("Python"));
        System.out.println("Java -> "+beech("Java"));
        System.out.println("Robot -> "+beech("Robot"));
        System.out.println("Code -> "+beech("Code"));
    }
}
