// Q309
package threads;
public class Q309 {
    static class Hello extends Thread {
        public void run(){
            System.out.println("Hello, World!");
        }
    }
    public static void main(String[] args) throws Exception {
        Hello t = new Hello();
        t.start();
        t.join();      // thread khatam hone tak ruko
    }
}
