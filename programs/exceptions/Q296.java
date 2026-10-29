// Q296
package exceptions;
public class Q296 {
    public static void main(String[] args) {
        try{
            int a = 50, b = 0;
            System.out.println(a/b);     // yaha exception aayega
        }
        catch(ArithmeticException e){
            System.out.println("Caught exception: "+e.getMessage());
        }
        System.out.println("The program continued running");
    }
}
