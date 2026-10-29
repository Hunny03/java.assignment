// Q298
package exceptions;
import java.io.*;
public class Q298 {
    static void padho(String name) throws FileNotFoundException {
        File f = new File(name);
        if(!f.exists())
            throw new FileNotFoundException("File nahi mili: "+name);
        System.out.println("File found");
    }
    public static void main(String[] args) {
        try{
            padho("koi_file_nahi.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
