// Q175
package basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q175 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current date and time = "+now.format(f));
    }
}
