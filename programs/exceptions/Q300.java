// Q300
package exceptions;
import java.io.*;
public class Q300 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("khali.txt");
        fw.close();          // kuch nahi likha, file khali hai
        File f = new File("khali.txt");
        try{
            if(f.length()==0)
                throw new Exception("File khali hai");
            System.out.println("The file contains data");
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
