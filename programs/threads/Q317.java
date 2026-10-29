// Q317
package threads;
public class Q317 {
    static class Ginti extends Thread {
        int delay;
        Ginti(String name, int delay){
            super(name);
            this.delay = delay;
        }
        public void run(){
            for(int i=1;i<=3;i++){
                System.out.println(getName()+" step "+i);
                try{ Thread.sleep(delay); }catch(Exception e){}
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Ginti a = new Ginti("Slow",300);
        Ginti b = new Ginti("Fast",100);
        a.start();
        Thread.sleep(20);
        b.start();
        a.join();
        b.join();
    }
}
