// Q056
package strings;
public class Q056 {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        System.out.println("All subsets:");
        // 0 se 2^n tak ka har number ek subset batata hai (bits dekh kar)
        for(int i=0;i<Math.pow(2,n);i++){
            String sub = "";
            for(int j=0;j<n;j++){
                if((i/(int)Math.pow(2,j))%2==1)
                    sub = sub + s.charAt(j);
            }
            if(sub.equals(""))
                System.out.println("(empty)");
            else
                System.out.println(sub);
        }
    }
}
