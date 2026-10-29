// Q278
package inheritance;
public class Q278 {
    static abstract class Employee {
        String name;
        Employee(String name){ this.name = name; }
        abstract double calculateSalary();
        abstract void displayInfo();
    }
    static class Manager extends Employee {
        double basic, allow;
        Manager(String name, double basic, double allow){ super(name); this.basic=basic; this.allow=allow; }
        double calculateSalary(){ return basic+allow; }
        void displayInfo(){ System.out.println("Manager "+name+", salary = "+calculateSalary()); }
    }
    static class Programmer extends Employee {
        double rate;
        int hours;
        Programmer(String name, double rate, int hours){ super(name); this.rate=rate; this.hours=hours; }
        double calculateSalary(){ return rate*hours; }
        void displayInfo(){ System.out.println("Programmer "+name+", salary = "+calculateSalary()); }
    }
    public static void main(String[] args) {
        Employee e[] = {new Manager("Ritu",80000,15000), new Programmer("Dev",650,160)};
        for(int i=0;i<e.length;i++)
            e[i].displayInfo();
    }
}
