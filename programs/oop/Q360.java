// Q360
package oop;
import java.time.LocalDate;
public class Q360 {
    static class Employee {
        String name;
        double salary;
        int joinYear;
        Employee(String name, double salary, int joinYear){ this.name=name; this.salary=salary; this.joinYear=joinYear; }
        int yearsOfService(){
            int now = LocalDate.now().getYear();
            return now - joinYear;
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Harpreet",75000,2015);
        Employee e2 = new Employee("Simran",48000,LocalDate.now().getYear());
        System.out.println(e1.name+" joined in "+e1.joinYear+", years of service = "+e1.yearsOfService());
        System.out.println(e2.name+" joined in "+e2.joinYear+", years of service = "+e2.yearsOfService());
    }
}
