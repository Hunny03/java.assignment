// Q033
package functions;
public class Q033 {
    static int count2_0(int n){
        int c = 0;
        while(n>0){
            if(n%10==2) c++;
            n = n/10;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Count of digit 2 in 2202 = "+count2_0(2202));
        System.out.println("Count of digit 2 in 135 = "+count2_0(135));
        System.out.println("Count of digit 2 in 222222 = "+count2_0(222222));
    }
}
