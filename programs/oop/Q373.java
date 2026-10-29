// Q373
package oop;
public class Q373 {
    static class Point {
        int x, y;
        Point(int x, int y){ this.x=x; this.y=y; }
        // copy constructor: dusre object se naya object banata hai
        Point(Point p){
            x = p.x;
            y = p.y;
        }
    }
    public static void main(String[] args) {
        Point a = new Point(4,9);
        Point b = new Point(a);
        System.out.println("a = ("+a.x+","+a.y+")");
        System.out.println("b = ("+b.x+","+b.y+")");
        System.out.println("Are they the same object? "+(a==b));
    }
}
