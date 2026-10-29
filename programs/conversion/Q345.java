// Q345
package conversion;
import java.sql.Timestamp;
import java.util.Date;
public class Q345 {
    public static void main(String[] args) {
        Timestamp t = Timestamp.valueOf("2026-03-14 18:45:10");
        Date d = new Date(t.getTime());
        System.out.println("Timestamp = "+t);
        System.out.println("Date = "+d);
    }
}
