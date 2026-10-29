// Q295
package inputoutput;
import java.io.*;
public class Q295 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("count.txt");
        fw.write("Java makes file handling simple\nCount every line and word\nand every single character\n");
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("count.txt"));
        String line;
        int l = 0, w = 0, c = 0;
        while((line=br.readLine())!=null){
            System.out.println(line);
            l++;
            c = c + line.length();
            w = w + line.split(" ").length;
        }
        br.close();
        System.out.println("---------");
        System.out.println("Lines = "+l);
        System.out.println("Words = "+w);
        System.out.println("Characters = "+c);
    }
}
