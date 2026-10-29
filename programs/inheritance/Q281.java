// Q281
package inheritance;
public class Q281 {
    static abstract class Person {
        abstract void eat();
        abstract void exercise();
    }
    static class Athlete extends Person {
        void eat(){ System.out.println("The athlete eats healthy, protein-rich food"); }
        void exercise(){ System.out.println("The athlete practices for hours every day"); }
    }
    static class LazyPerson extends Person {
        void eat(){ System.out.println("The lazy person sits on the sofa and eats chips"); }
        void exercise(){ System.out.println("The lazy person only walks to the fridge"); }
    }
    public static void main(String[] args) {
        Person p[] = {new Athlete(), new LazyPerson()};
        for(int i=0;i<p.length;i++){
            p[i].eat();
            p[i].exercise();
        }
    }
}
