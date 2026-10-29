// Q299
package exceptions;
import java.io.*;
public class Q299 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("nums.txt");
        fw.write("-5\n-12\n0\n7\n-3\n");
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("nums.txt"));
        String line;
        try{
            while((line=br.readLine())!=null){
                int n = Integer.parseInt(line);
                if(n>0)
                    throw new Exception("Positive number mila: "+n);
                System.out.println("OK: "+n);
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        br.close();
    }
}
