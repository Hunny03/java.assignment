// Q353
package oop;
public class Q353 {
    static class Dog {
        String name, breed;
        Dog(String name, String breed){ this.name=name; this.breed=breed; }
        void setName(String name){ this.name = name; }
        void setBreed(String breed){ this.breed = breed; }
        void show(){ System.out.println(name+" ("+breed+")"); }
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("Bruno","Labrador");
        Dog d2 = new Dog("Tiger","Beagle");
        d1.show();
        d2.show();
        d1.setName("Max");
        d2.setBreed("German Shepherd");
        d1.show();
        d2.show();
    }
}
