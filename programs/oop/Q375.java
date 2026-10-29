// Q375
package oop;
public class Q375 {
    static double area(double r){
        return 3.14159*r*r;      // circle
    }
    static double area(double l, double b){
        return l*b;              // rectangle
    }
    public static void main(String[] args) {
        System.out.println("Circle area = "+area(7));
        System.out.println("Rectangle area = "+area(12,5));
    }
}
