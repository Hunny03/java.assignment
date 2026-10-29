// Q263
package inheritance;
public class Q263 {
    static class Employee {
        String name;
        double salary;
        Employee(String name, double salary){ this.name=name; this.salary=salary; }
        void work(){ System.out.println(name+" is doing its work"); }
        double getSalary(){ return salary; }
    }
    static class HRManager extends Employee {
        Employee list[] = new Employee[10];
        int cnt = 0;
        HRManager(String name, double salary){ super(name,salary); }
        void work(){ System.out.println(name+" is conducting interviews and handling HR duties"); }
        void addEmployee(Employee e){
            list[cnt] = e;
            cnt++;
            System.out.println(name+" added "+e.name+", total employees = "+cnt);
        }
    }
    public static void main(String[] args) {
        Employee e = new Employee("Pooja",28000);
        HRManager m = new HRManager("Gaurav",65000);
        e.work();
        m.work();
        m.addEmployee(e);
        System.out.println("Manager salary = "+m.getSalary());
    }
}
