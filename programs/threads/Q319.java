// Q319
package threads;
public class Q319 {
    static class Ticket {
        int seats = 5;
        // synchronized na ho to do thread ek saath seat le sakte hai
        synchronized void book(String name){
            if(seats>0){
                seats--;
                System.out.println(name+" booked a seat, remaining = "+seats);
            }
            else
                System.out.println(name+" could not get a seat");
        }
    }
    static class Customer extends Thread {
        Ticket t;
        String name;
        Customer(Ticket t, String name){
            this.t = t;
            this.name = name;
        }
        public void run(){
            t.book(name);
        }
    }
    public static void main(String[] args) throws Exception {
        Ticket t = new Ticket();
        for(int i=1;i<=7;i++){
            Customer c = new Customer(t,"Customer-"+i);
            c.start();
            c.join();
        }
    }
}
