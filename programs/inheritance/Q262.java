// Q262
package inheritance;
public class Q262 {
    static class Shape {
        double getArea(){ return 0; }
    }
    static class Rectangle extends Shape {
        double l, b;
        Rectangle(double l, double b){ this.l=l; this.b=b; }
        double getArea(){ return l*b; }
    }
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape r = new Rectangle(12,7);
        System.out.println("Shape area = "+s.getArea());
        System.out.println("Rectangle area = "+r.getArea());
    }
}
