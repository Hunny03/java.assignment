// Q367
package oop;
public class Q367 {
    static abstract class Shape {
        abstract double area();
        abstract double perimeter();
    }
    static class Rectangle extends Shape {
        double l, b;
        Rectangle(double l, double b){ this.l=l; this.b=b; }
        double area(){ return l*b; }
        double perimeter(){ return 2*(l+b); }
    }
    static class Circle extends Shape {
        double r;
        Circle(double r){ this.r=r; }
        double area(){ return 3.14159*r*r; }
        double perimeter(){ return 2*3.14159*r; }
    }
    static class Triangle extends Shape {
        double a, b, c;
        Triangle(double a, double b, double c){ this.a=a; this.b=b; this.c=c; }
        double perimeter(){ return a+b+c; }
        double area(){
            double s = (a+b+c)/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
    }
    public static void main(String[] args) {
        Shape s[] = {new Rectangle(9,4), new Circle(2.5), new Triangle(5,12,13)};
        for(int i=0;i<s.length;i++)
            System.out.println("Area = "+s[i].area()+", Perimeter = "+s[i].perimeter());
    }
}
