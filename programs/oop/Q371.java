// Q371
package oop;
public class Q371 {
    static class Phone {
        String brand;
        int storage;
        // constructor nahi likha to java khud default constructor bana deta hai
    }
    static class Laptop {
        String brand;
        Laptop(){
            brand = "Unknown";
            System.out.println("Laptop default constructor called");
        }
    }
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println("Phone brand = "+p.brand+", storage = "+p.storage);
        Laptop l = new Laptop();
        System.out.println("Laptop brand = "+l.brand);
    }
}
