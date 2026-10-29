// Q380
package oop;
public class Q380 {
    static class Employee {
        private int employee_id;
        private String employee_name;
        private double employee_salary;
        Employee(int id, String name, double sal){
            employee_id = id;
            employee_name = name;
            employee_salary = sal;
        }
        public int getEmployee_id(){ return employee_id; }
        public void setEmployee_id(int id){ employee_id = id; }
        public String getEmployee_name(){ return employee_name; }
        public void setEmployee_name(String n){ employee_name = n; }
        // salary ka setter nahi diya, sirf getter hai
        public double getEmployee_salary(){ return employee_salary; }
    }
    public static void main(String[] args) {
        Employee e = new Employee(7001,"Tanmay",85000);
        e.setEmployee_name("Tanmay Sethi");
        System.out.println(e.getEmployee_id()+" | "+e.getEmployee_name()+" | "+e.getEmployee_salary());
    }
}
