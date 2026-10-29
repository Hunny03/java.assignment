// Q379
package oop;
public class Q379 {
    static class Rectangle {
        private double length, width;
        public double getLength(){ return length; }
        public void setLength(double l){ length = l; }
        public double getWidth(){ return width; }
        public void setWidth(double w){ width = w; }
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(15);
        r.setWidth(6);
        System.out.println("Length = "+r.getLength()+", Width = "+r.getWidth());
        System.out.println("Area = "+r.getLength()*r.getWidth());
    }
}
