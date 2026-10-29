// Q031
package functions;
import java.time.LocalDateTime;
public class Q031 {
    static void waqt(){
        LocalDateTime t = LocalDateTime.now();
        System.out.println("Date and time: "+t);
    }
    public static void main(String[] args) {
        waqt();
    }
}
