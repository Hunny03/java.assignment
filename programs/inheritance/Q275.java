// Q275
package inheritance;
public class Q275 {
    static abstract class Shape {
        abstract double calculateArea();
        abstract double calculatePerimeter();
    }
    static class Circle extends Shape {
        double r;
        Circle(double r){ this.r=r; }
        double calculateArea(){ return 3.14159*r*r; }
        double calculatePerimeter(){ return 2*3.14159*r; }
    }
    static class Triangle extends Shape {
        double a, b, c;
        Triangle(double a, double b, double c){ this.a=a; this.b=b; this.c=c; }
        double calculatePerimeter(){ return a+b+c; }
        double calculateArea(){
            double s = (a+b+c)/2;      // heron formula
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
    }
    public static void main(String[] args) {
        Shape s[] = {new Circle(4), new Triangle(3,4,5)};
        for(int i=0;i<s.length;i++){
            System.out.println("Area = "+s[i].calculateArea()+", Perimeter = "+s[i].calculatePerimeter());
        }
    }
}
