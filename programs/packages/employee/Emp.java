// Q256
package packages.employee;
public class Emp {
    String name;
    int empid;
    char category;
    double bpay, hra, da, npay, pf, grosspay, incometax, allowance;
    public Emp(String name, int empid, char category, double bpay){
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
    }
    public void calculate(){
        hra = bpay*0.20;
        da = bpay*0.50;
        if(category=='A') allowance = 5000;
        else if(category=='B') allowance = 3000;
        else allowance = 1000;
        grosspay = bpay + hra + da + allowance;
        pf = bpay*0.12;
        if(grosspay>100000) incometax = grosspay*0.10;
        else incometax = grosspay*0.05;
        npay = grosspay - pf - incometax;
    }
    public void display(){
        System.out.println("Employee id = "+empid);
        System.out.println("Name = "+name);
        System.out.println("Category = "+category);
        System.out.println("Basic pay = "+bpay);
        System.out.println("HRA = "+hra);
        System.out.println("DA = "+da);
        System.out.println("Allowance = "+allowance);
        System.out.println("Gross pay = "+grosspay);
        System.out.println("PF = "+pf);
        System.out.println("Income tax = "+incometax);
        System.out.println("Net pay = "+npay);
    }
}
