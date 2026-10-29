// Q277
package inheritance;
public class Q277 {
    static abstract class Animal {
        abstract void eat();
        abstract void sleep();
    }
    static class Lion extends Animal {
        void eat(){ System.out.println("The lion hunts for meat"); }
        void sleep(){ System.out.println("The lion sleeps for 20 hours a day"); }
    }
    static class Tiger extends Animal {
        void eat(){ System.out.println("The tiger eats deer"); }
        void sleep(){ System.out.println("The tiger rests in the shade"); }
    }
    static class Deer extends Animal {
        void eat(){ System.out.println("The deer eats grass"); }
        void sleep(){ System.out.println("The deer sleeps briefly and stays alert"); }
    }
    public static void main(String[] args) {
        Animal a[] = {new Lion(), new Tiger(), new Deer()};
        for(int i=0;i<a.length;i++){
            a[i].eat();
            a[i].sleep();
        }
    }
}
