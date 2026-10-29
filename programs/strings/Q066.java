// Q066
package strings;
import java.io.*;
public class Q066 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("notes.txt");
        fw.write("Java is a popular language\nit runs almost everywhere\nlearn it well");
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
        String line;
        int words = 0;
        while((line=br.readLine())!=null){
            line = line.trim();
            if(line.length()>0)
                words = words + line.split(" ").length;
        }
        br.close();
        System.out.println("Words in file = "+words);
    }
}
