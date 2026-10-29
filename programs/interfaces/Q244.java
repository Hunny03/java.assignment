// Q244
package interfaces;
public class Q244 {
    interface Drawable {
        void draw();
    }
    static class Circle implements Drawable {
        public void draw(){
            System.out.println("  ***  ");
            System.out.println(" *   * ");
            System.out.println("  ***  ");
        }
    }
    static class Rectangle implements Drawable {
        public void draw(){
            System.out.println("********");
            System.out.println("*      *");
            System.out.println("********");
        }
    }
    static class Triangle implements Drawable {
        public void draw(){
            System.out.println("   *");
            System.out.println("  ***");
            System.out.println(" *****");
        }
    }
    public static void main(String[] args) {
        Drawable d[] = {new Circle(), new Rectangle(), new Triangle()};
        for(int i=0;i<d.length;i++){
            d[i].draw();
            System.out.println();
        }
    }
}
