// Q286
package inputoutput;
import java.io.*;
public class Q286 {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        System.out.print("Enter a character: ");
        int x = r.read();       // read() int deta hai
        char c = (char) x;
        System.out.println("You entered: "+c);
    }
}
