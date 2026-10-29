// Q355
package oop;
public class Q355 {
    static class Circle {
        double r;
        Circle(double r){ this.r = r; }
        double getRadius(){ return r; }
        void setRadius(double r){ this.r = r; }
        double area(){ return 3.14159*r*r; }
        double circumference(){ return 2*3.14159*r; }
    }
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Radius = "+c.getRadius()+", area = "+c.area()+", circumference = "+c.circumference());
        c.setRadius(9.5);
        System.out.println("Radius = "+c.getRadius()+", area = "+c.area()+", circumference = "+c.circumference());
    }
}
