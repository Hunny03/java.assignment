// Q306
package exceptions;
import java.io.*;
public class Q306 {
    // throws likhne ka matlab: ye method exception de sakta hai, call karne wala sambhale
    static void khol(boolean galat) throws IOException {
        if(galat)
            throw new IOException("settings.cfg khul nahi payi");
        System.out.println("Settings loaded");
    }
    public static void main(String[] args) {
        try{
            khol(false);
            khol(true);
        }
        catch(IOException e){
            System.out.println("Caught in main: "+e.getMessage());
        }
    }
}
