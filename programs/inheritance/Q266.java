// Q266
package inheritance;
public class Q266 {
    static class Person {
        String firstName, lastName;
        Person(String f, String l){ firstName=f; lastName=l; }
        String getFirstName(){ return firstName; }
        String getLastName(){ return lastName; }
    }
    static class Employee extends Person {
        int id;
        String job;
        Employee(String f, String l, int id, String job){
            super(f,l);
            this.id = id;
            this.job = job;
        }
        int getId(){ return id; }
        String getLastName(){ return super.getLastName()+" ("+job+")"; }
    }
    public static void main(String[] args) {
        Employee e = new Employee("Sunil","Verma",4021,"Network Engineer");
        System.out.println("First name = "+e.getFirstName());
        System.out.println("Last name = "+e.getLastName());
        System.out.println("Id = "+e.getId());
    }
}
