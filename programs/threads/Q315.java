// Q315
package threads;
public class Q315 {
    static class Account {
        int bal = 1000;
        synchronized void deposit(int x){
            bal = bal + x;
        }
        synchronized void withdraw(int x){
            if(x<=bal)
                bal = bal - x;
        }
    }
    static class Jama extends Thread {
        Account ac;
        Jama(Account ac){ this.ac = ac; }
        public void run(){
            for(int i=0;i<1000;i++) ac.deposit(10);
        }
    }
    static class Nikalo extends Thread {
        Account ac;
        Nikalo(Account ac){ this.ac = ac; }
        public void run(){
            for(int i=0;i<1000;i++) ac.withdraw(5);
        }
    }
    public static void main(String[] args) throws Exception {
        Account ac = new Account();
        Jama t1 = new Jama(ac);
        Nikalo t2 = new Nikalo(ac);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // 1000 + 10000 - 5000 = 6000 (synchronized ki wajah se hamesha sahi)
        System.out.println("Final balance = "+ac.bal);
    }
}
