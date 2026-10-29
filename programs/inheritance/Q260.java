// Q260
package inheritance;
public class Q260 {
    static class Animal {
        void makeSound(){ System.out.println("The animal makes a sound"); }
    }
    static class Cat extends Animal {
        void makeSound(){ System.out.println("The cat is barking (as stated in the question)"); }
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        a.makeSound();
        c.makeSound();
    }
}
