// Q357
package oop;
public class Q357 {
    static class Employee {
        String name, job;
        double salary;
        Employee(String name, String job, double salary){ this.name=name; this.job=job; this.salary=salary; }
        double calculateAnnualSalary(){ return salary*12; }
        void updateSalary(double s){ salary = s; }
        void giveRaise(double percent){ salary = salary + salary*percent/100; }
        void show(){ System.out.println(name+", "+job+", monthly = "+salary+", yearly = "+calculateAnnualSalary()); }
    }
    public static void main(String[] args) {
        Employee e = new Employee("Isha","Analyst",42000);
        e.show();
        e.giveRaise(10);
        e.show();
        e.updateSalary(60000);
        e.show();
    }
}
