// Q320
package threads;
public class Q320 {
    static class box {
        String msg;
        boolean full = false;
        synchronized void put (String m) throws Exception {
            while(full) wait();          
            msg = m;
            full = true;
            System.out.println("Added: "+m);
            notify();
        }
        synchronized void pull() throws Exception {
            while(!full) wait();         
            System.out.println("Removed: "+msg);
            full =false;
            notify();
        }
    }
    static class Likhne extends Thread {
        box d;
        Likhne(box d){ this.d = d; }
        public void run(){
            try{
                for(int i=1 ;i<=3 ;i++){
                    d.put("letter-"+i);
                    Thread.sleep(100);
                }
            }catch( Exception e){}
        }
    }
    static class Padhne extends Thread {
        box d;
        Padhne(box d){ this.d = d; }
        public void run(){
            try{
                for(int i=1;i<=3;i++)
                      d.pull();
            }catch(Exception e){}
        }
    }
    public static void main(String[] args) throws Exception {
        box d = new box();
        Likhne w  new Likhne(d);
        Padhne r = new Padhne(d);
        r.start();
        w.start();
        w.join();
        r.join();
        
    }
}
