// Q252
package packages;
import java.util.Date;
public class Q252 {
    static class MyDate extends Date {
        void show(){
            System.out.println("MyDate says: "+this);
        }
    }
    public static void main(String[] args) {
        MyDate d = new MyDate();
        d.show();
    }
}
