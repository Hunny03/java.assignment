// Q240
package interfaces;
public class Q240 {
    interface Animal {
        void bark();
    }
    static class Dog implements Animal {
        public void bark(){
            System.out.println("The dog is barking");
        }
    }
    public static void main(String[] args) {
        Animal a = new Dog();
        a.bark();
    }
}
