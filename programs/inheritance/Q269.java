// Q269
package inheritance;
public class Q269 {
    static class Employee {
        String name, address, job;
        double salary;
        Employee(String name, String address, double salary, String job){
            this.name=name; this.address=address; this.salary=salary; this.job=job;
        }
        double calculateBonus(){ return salary*0.05; }
        String performanceReport(){ return name+" ("+job+") - satisfactory"; }
    }
    static class Manager extends Employee {
        String projects = "";
        Manager(String name, String address, double salary){ super(name,address,salary,"Manager"); }
        void manageProject(String p){ projects = projects + p + ", "; }
        double calculateBonus(){ return salary*0.20; }
        String performanceReport(){ return name+" (Manager) projects: "+projects; }
    }
    static class Developer extends Employee {
        Developer(String name, String address, double salary){ super(name,address,salary,"Developer"); }
        double calculateBonus(){ return salary*0.12; }
        String performanceReport(){ return name+" (Developer) - time par features diye"; }
    }
    static class Programmer extends Employee {
        Programmer(String name, String address, double salary){ super(name,address,salary,"Programmer"); }
        double calculateBonus(){ return salary*0.08; }
    }
    public static void main(String[] args) {
        Manager m = new Manager("Kavya","Mohali",120000);
        m.manageProject("Payroll portal");
        m.manageProject("Mobile app");
        Employee e[] = {m, new Developer("Arjun","Chandigarh",90000), new Programmer("Neha","Zirakpur",60000)};
        for(int i=0;i<e.length;i++){
            System.out.println(e[i].performanceReport());
            System.out.println("   bonus = "+e[i].calculateBonus());
        }
    }
}
