// Q243
package interfaces;
public class Q243 {
    interface Resizable {
        void resizeWidth(int w);
        void resizeHeight(int h);
    }
    static class Rectangle implements Resizable {
        int w, h;
        Rectangle(int w, int h){ this.w=w; this.h=h; }
        public void resizeWidth(int w){ this.w = w; }
        public void resizeHeight(int h){ this.h = h; }
        void show(){ System.out.println("Width = "+w+", Height = "+h); }
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(40,20);
        r.show();
        r.resizeWidth(65);
        r.resizeHeight(30);
        r.show();
    }
}
