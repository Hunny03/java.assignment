// Q253
package packages;
public class Q253 {
    static class MyDate extends java.util.Date {
        void show(){
            System.out.println("MyDate says: "+this);
        }
    }
    public static void main(String[] args) {
        MyDate d = new MyDate();
        d.show();
    }
}
