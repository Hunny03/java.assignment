// Q318
package threads;
public class Q318 {
    static class Mera extends Thread {
        public void run(){
            System.out.println(getName()+" is running, priority = "+getPriority());
        }
    }
    public static void main(String[] args) throws Exception {
        Mera t1 = new Mera();
        Mera t2 = new Mera();
        Mera t3 = new Mera();
        t1.setName("Low-Thread");
        t2.setName("Normal-Thread");
        t3.setName("High-Thread");
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);
        t1.start(); t1.join();
        t2.start(); t2.join();
        t3.start(); t3.join();
    }
}
