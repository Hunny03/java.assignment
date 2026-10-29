// Q280
package inheritance;
public class Q280 {
    static abstract class Vehicle {
        abstract void startEngine();
        abstract void stopEngine();
    }
    static class Car extends Vehicle {
        void startEngine(){ System.out.println("Car: press the button to start the engine"); }
        void stopEngine(){ System.out.println("Car: press the button again to stop the engine"); }
    }
    static class Motorcycle extends Vehicle {
        void startEngine(){ System.out.println("Motorcycle: kick-start the engine"); }
        void stopEngine(){ System.out.println("Motorcycle: turn off the ignition to stop the engine"); }
    }
    public static void main(String[] args) {
        Vehicle v[] = {new Car(), new Motorcycle()};
        for(int i=0;i<v.length;i++){
            v[i].startEngine();
            v[i].stopEngine();
        }
    }
}
