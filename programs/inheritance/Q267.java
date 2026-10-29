// Q267
package inheritance;
public class Q267 {
    static class Shape {
        double getPerimeter(){ return 0; }
        double getArea(){ return 0; }
    }
    static class Circle extends Shape {
        double r;
        Circle(double r){ this.r = r; }
        double getPerimeter(){ return 2*3.14159*r; }
        double getArea(){ return 3.14159*r*r; }
    }
    public static void main(String[] args) {
        Shape s = new Circle(6);
        System.out.println("Perimeter = "+s.getPerimeter());
        System.out.println("Area = "+s.getArea());
    }
}
