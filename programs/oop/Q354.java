// Q354
package oop;
public class Q354 {
    static class Rectangle {
        double w, h;
        Rectangle(double w, double h){ this.w=w; this.h=h; }
        double area(){ return w*h; }
        double perimeter(){ return 2*(w+h); }
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12.5,8);
        System.out.println("Area = "+r.area());
        System.out.println("Perimeter = "+r.perimeter());
    }
}
