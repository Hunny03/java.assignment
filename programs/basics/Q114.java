// Q114
package basics;
import java.time.LocalTime;
public class Q114 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println("System time = "+t.getHour()+":"+t.getMinute()+":"+t.getSecond());
    }
}
