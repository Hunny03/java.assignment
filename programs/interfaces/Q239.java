// Q239
package interfaces;
public class Q239 {
    interface Shape {
        double getArea();
    }
    static class Rectangle implements Shape {
        double s1, s2;
        Rectangle(double s1, double s2){ this.s1=s1; this.s2=s2; }
        public double getArea(){ return s1*s2; }
    }
    static class Circle implements Shape {
        double r;
        Circle(double r){ this.r=r; }
        public double getArea(){ return 3.14159*r*r; }
    }
    static class Triangle implements Shape {
        double b, h;
        Triangle(double b, double h){ this.b=b; this.h=h; }
        public double getArea(){ return 0.5*b*h; }
    }
    public static void main(String[] args) {
        Shape s1 = new Rectangle(8,5);
        Shape s2 = new Circle(3);
        Shape s3 = new Triangle(10,4);
        System.out.println("Rectangle area = "+s1.getArea());
        System.out.println("Circle area = "+s2.getArea());
        System.out.println("Triangle area = "+s3.getArea());
    }
}
