// Q381
package oop;
public class Q381 {
    static class Circle {
        private double radius;
        public double getRadius(){ return radius; }
        public void setRadius(double r){ radius = r; }
        public double calculateArea(){ return 3.14159*radius*radius; }
        public double calculatePerimeter(){ return 2*3.14159*radius; }
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(4);
        System.out.println("Radius "+c.getRadius()+": area = "+c.calculateArea()+", perimeter = "+c.calculatePerimeter());
        c.setRadius(10);
        System.out.println("Radius "+c.getRadius()+": area = "+c.calculateArea()+", perimeter = "+c.calculatePerimeter());
    }
}
