// Q229
package basics;
public class Q229 {
    static void prime( int  a, int b){
        for(int n=a;n<=b;n++){
            int flag = 1;
            if(n<2) flag = 0;
            for(int i=2; i*i<=n ; i++){
                if(n%i==0) flag = 0;
            }
            if(flag== 1)
                System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Prime numbers  between 1 and 20:");
        prime(1,20);
    }
}
