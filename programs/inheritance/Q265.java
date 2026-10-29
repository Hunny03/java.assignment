// Q265
package inheritance;
public class Q265 {
    static class Animal {
        void move(){ System.out.println("The animal moves"); }
    }
    static class Cheetah extends Animal {
        void move(){ System.out.println("The cheetah runs at 100 km/h"); }
    }
    public static void main(String[] args) {
        Animal a = new Cheetah();      // parent ka reference, child ka object
        a.move();
    }
}
