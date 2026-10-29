// Q330
package conversion;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q330 {
    public static void main(String[] args) throws Exception {
        String s = "15/08/2026";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date d = f.parse(s);
        System.out.println("String: "+s);
        System.out.println("Date: "+d);
    }
}
