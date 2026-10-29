// Q119
package basics;
public class Q119 {
    public static void main(String[] args) {
        int cnt = 0, n = 2;
        long tot = 0;
        while(cnt<100){
            int flag = 1;     // 1 matlab prime
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                tot = tot + n;
                cnt++;
            }
            n++;
        }
        System.out.println("Sum of the first 100 prime numbers = "+tot);
    }
}
