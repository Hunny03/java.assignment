// Q274
package inheritance;
public class Q274 {
    static abstract class Animal {
        abstract void sound();
    }
    static class Lion extends Animal {
        void sound(){ System.out.println("Lion: ROAAR"); }
    }
    static class Tiger extends Animal {
        void sound(){ System.out.println("Tiger: GRRRR"); }
    }
    public static void main(String[] args) {
        Animal a[] = {new Lion(), new Tiger()};
        for(int i=0;i<a.length;i++)
            a[i].sound();
    }
}
