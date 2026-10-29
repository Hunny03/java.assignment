// Q268
package inheritance;
public class Q268 {
    static class Vehicle {
        String make, model, fuel;
        int year;
        double dist, fuelUsed, speed;
        Vehicle(String make, String model, int year, String fuel, double dist, double fuelUsed, double speed){
            this.make=make; this.model=model; this.year=year; this.fuel=fuel;
            this.dist=dist; this.fuelUsed=fuelUsed; this.speed=speed;
        }
        double fuelEfficiency(){ return dist/fuelUsed; }
        double distanceTravelled(){ return dist; }
        double maxSpeed(){ return speed; }
        void show(){
            System.out.println(make+" "+model+" ("+year+", "+fuel+") efficiency="+fuelEfficiency()+" km/l, distance="+distanceTravelled()+", speed="+maxSpeed());
        }
    }
    static class Truck extends Vehicle {
        Truck(String make, String model, int year, String fuel, double dist, double fuelUsed){
            super(make,model,year,fuel,dist,fuelUsed,110);
        }
        double fuelEfficiency(){ return super.fuelEfficiency()*0.85; }   // bhaar ki wajah se kam
    }
    static class Car extends Vehicle {
        Car(String make, String model, int year, String fuel, double dist, double fuelUsed){
            super(make,model,year,fuel,dist,fuelUsed,180);
        }
    }
    static class Motorcycle extends Vehicle {
        Motorcycle(String make, String model, int year, String fuel, double dist, double fuelUsed){
            super(make,model,year,fuel,dist,fuelUsed,150);
        }
    }
    public static void main(String[] args) {
        Vehicle v[] = new Vehicle[3];
        v[0] = new Truck("Tata","Prima",2022,"Diesel",800,120);
        v[1] = new Car("Hyundai","Creta",2024,"Petrol",450,30);
        v[2] = new Motorcycle("Bajaj","Pulsar",2023,"Petrol",300,6);
        for(int i=0;i<3;i++)
            v[i].show();
    }
}
