// Q310
package threads;
public class Q310 {
    static class Odd extends Thread {
        public void run(){
            for(int i=1;i<=20;i=i+2){
                System.out.println("Odd thread: "+i);
                try{ Thread.sleep(200); }catch(Exception e){}
            }
        }
    }
    static class Even extends Thread {
        public void run(){
            try{ Thread.sleep(100); }catch(Exception e){}   // thoda ruka taki odd pehle aaye
            for(int i=2;i<=20;i=i+2){
                System.out.println("Even thread: "+i);
                try{ Thread.sleep(200); }catch(Exception e){}
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Odd o = new Odd();
        Even e = new Even();
        o.start();
        e.start();
        o.join();
        e.join();
    }
}
