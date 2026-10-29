// Q283
package inheritance;
public class Q283 {
    static abstract class Shape2D {
        abstract void draw();
        abstract void resize(double f);
    }
    static class Rectangle extends Shape2D {
        double w = 4, h = 2;
        void draw(){ System.out.println("Rectangle "+w+" x "+h); }
        void resize(double f){ w = w*f; h = h*f; }
    }
    static class Circle extends Shape2D {
        double r = 3;
        void draw(){ System.out.println("Circle radius "+r); }
        void resize(double f){ r = r*f; }
    }
    public static void main(String[] args) {
        Shape2D s[] = {new Rectangle(), new Circle()};
        for(int i=0;i<s.length;i++){
            s[i].draw();
            s[i].resize(2.5);
            s[i].draw();
        }
    }
}
