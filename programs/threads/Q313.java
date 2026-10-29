// Q313
package threads;
public class Q313 {
    static long total = 0;
    static synchronized void add(long x){
        total = total + x;
    }
    static class PrimeThread extends Thread {
        int from, to;
        PrimeThread(int from, int to){
            this.from = from;
            this.to = to;
        }
        public void run(){
            long s = 0;
            for(int n=from;n<=to;n++){
                int flag = 1;
                if(n<2) flag = 0;
                for(int i=2;i*i<=n;i++){
                    if(n%i==0) flag = 0;
                }
                if(flag==1) s = s + n;
            }
            System.out.println("Sum of primes from "+from+" to "+to+" = "+s);
            add(s);
        }
    }
    public static void main(String[] args) throws Exception {
        int limit = 1000;
        PrimeThread t[] = new PrimeThread[4];
        for(int i=0;i<4;i++){
            t[i] = new PrimeThread(i*250+1, (i+1)*250);
            t[i].start();
            t[i].join();       // ek ek karke join taaki output order me aaye
        }
        System.out.println("Sum of primes up to "+limit+" = "+total);
    }
}
