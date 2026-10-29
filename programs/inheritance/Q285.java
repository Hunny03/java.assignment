// Q285
package inheritance;
public class Q285 {
    static abstract class GeometricShape {
        abstract double area();
        abstract double perimeter();
    }
    static class Triangle extends GeometricShape {
        double a, b, c;
        Triangle(double a, double b, double c){ this.a=a; this.b=b; this.c=c; }
        double perimeter(){ return a+b+c; }
        double area(){
            double s = perimeter()/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
    }
    static class Square extends GeometricShape {
        double s;
        Square(double s){ this.s = s; }
        double area(){ return s*s; }
        double perimeter(){ return 4*s; }
    }
    public static void main(String[] args) {
        GeometricShape g[] = {new Triangle(6,8,10), new Square(7)};
        for(int i=0;i<g.length;i++)
            System.out.println("Area = "+g[i].area()+", Perimeter = "+g[i].perimeter());
    }
}
