// Q284
package inheritance;
public class Q284 {
    static abstract class Bird {
        abstract void fly();
        abstract void makeSound();
    }
    static class Eagle extends Bird {
        void fly(){ System.out.println("The eagle flies high above the mountains"); }
        void makeSound(){ System.out.println("Eagle: kee-kee-kee"); }
    }
    static class Hawk extends Bird {
        void fly(){ System.out.println("The hawk flies low over the fields"); }
        void makeSound(){ System.out.println("Hawk: kree-eee-ar"); }
    }
    public static void main(String[] args) {
        Bird b[] = {new Eagle(), new Hawk()};
        for(int i=0;i<b.length;i++){
            b[i].fly();
            b[i].makeSound();
        }
    }
}
