// Q294
package inputoutput;
import java.io.*;
public class Q294 {
    public static void main(String[] args) throws IOException {
        // pehle file bana ke usme kuch likhte hai
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("Hello from a file!\nSecond line here.\n");
        fw.close();
        FileReader fr = new FileReader("demo.txt");
        int x;
        while((x=fr.read())!=-1)
            System.out.print((char)x);
        fr.close();
    }
}
