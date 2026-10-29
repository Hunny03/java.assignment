// Q272
package inheritance;
public class Q272 {
    static class Bird {
        void fly(){ System.out.println("Most birds can fly"); }
    }
    static class Penguin extends Bird {
        void fly(){ System.out.println("Penguins cannot fly, but they can swim"); }
    }
    static class Eagle extends Bird {
        void fly(){ System.out.println("The eagle flies at great heights"); }
    }
    public static void main(String[] args) {
        Bird b = new Bird();
        Bird p = new Penguin();
        Bird e = new Eagle();
        b.fly();
        p.fly();
        e.fly();
    }
}
