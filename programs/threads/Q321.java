// Q321
package threads;
public class Q321 {
    static class Loader extends Thread {
        public void run(){
            for(int i=1;i<=3;i++){
                System.out.println("Loader: part "+i+" is loading");
                Thread.yield();     // dusre thread ko mauka deta hai
            }
        }
    }
    static class Painter extends Thread {
        Loader l;
        Painter(Loader l){ this.l = l; }
        public void run(){
            try{ l.join(); }catch(Exception e){}   // loader khatam hone tak ruko
            System.out.println("Painter: painting the screen now");
        }
    }
    public static void main(String[] args) throws Exception {
        Loader l = new Loader();
        Painter p = new Painter(l);
        l.start();
        p.start();
        p.join();
        System.out.println("Main: all tasks completed");
    }
}
