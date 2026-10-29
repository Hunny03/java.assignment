// Q344
package conversion;
import java.sql.Timestamp;
import java.util.Date;
public class Q344 {
    public static void main(String[] args) {
        Date d = new Date();
        Timestamp t = new Timestamp(d.getTime());
        System.out.println("Date = "+d);
        System.out.println("Timestamp = "+t);
    }
}
