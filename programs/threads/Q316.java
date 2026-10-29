// Q316
package threads;
public class Q316 {
    static class Kaam implements Runnable {
        String naam;
        int delay;
        Kaam(String naam, int delay){
            this.naam = naam;
            this.delay = delay;
        }
        public void run(){
            try{ Thread.sleep(delay); }catch(Exception e){}
            System.out.println(naam+" is running, thread: "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Kaam("Download",50), "T1");
        Thread t2 = new Thread(new Kaam("Compress",150), "T2");
        Thread t3 = new Thread(new Kaam("Upload",250), "T3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
