// Q287
package inputoutput;
import java.io.*;
public class Q287 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String s = br.readLine();
        System.out.println("Hello "+s);
    }
}
