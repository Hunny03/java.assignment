// Q331
package conversion;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q331 {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        String s = f.format(d);
        System.out.println("Date as a string: "+s);
    }
}
