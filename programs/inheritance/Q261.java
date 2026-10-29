// Q261
package inheritance;
public class Q261 {
    static class Vehicle {
        void drive(){ System.out.println("The vehicle is moving"); }
    }
    static class Car extends Vehicle {
        void drive(){ System.out.println("The car is being repaired"); }
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.drive();
        c.drive();
    }
}
