// Q363
package oop;
public class Q363 {
    static class Airplane {
        String flight, dest;
        int h, m;
        boolean late = false;
        Airplane(String flight, String dest, int h, int m){ this.flight=flight; this.dest=dest; this.h=h; this.m=m; }
        void delay(int mins){
            m = m + mins;
            h = h + m/60;
            m = m%60;
            h = h%24;
            late = true;
        }
        void checkStatus(){
            System.out.print(flight+" to "+dest+" departs at "+h+":"+m);
            if(late) System.out.println(" (DELAYED)");
            else System.out.println(" (ON TIME)");
        }
    }
    public static void main(String[] args) {
        Airplane a = new Airplane("AI-472","Mumbai",14,35);
        a.checkStatus();
        a.delay(95);
        a.checkStatus();
    }
}
