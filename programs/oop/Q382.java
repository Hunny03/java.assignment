// Q382
package oop;
public class Q382 {
    static class Car {
        private String company_name, model_name;
        private int year;
        private double mileage;
        Car(String c, String m, int y, double mil){
            company_name = c;
            model_name = m;
            year = y;
            mileage = mil;
        }
        public String getCompany_name(){ return company_name; }
        public void setCompany_name(String c){ company_name = c; }
        public String getModel_name(){ return model_name; }
        public void setModel_name(String m){ model_name = m; }
        public int getYear(){ return year; }
        public void setYear(int y){ year = y; }
        public double getMileage(){ return mileage; }     // sirf getter
    }
    public static void main(String[] args) {
        Car c = new Car("Maruti","Swift",2021,18200.5);
        c.setYear(2022);
        c.setModel_name("Swift ZXi");
        System.out.println(c.getCompany_name()+" "+c.getModel_name()+" ("+c.getYear()+") mileage = "+c.getMileage()+" km");
    }
}
