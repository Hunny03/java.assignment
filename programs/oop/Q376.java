// Q376
package oop;
public class Q376 {
    public static void main(String[] args) {
        // chalane ka tareeka:  java oop.Q376 red green blue
        if(args.length==0){
            System.out.println("No command-line arguments were provided");
            System.out.println("Run it like this: java oop.Q376 red green blue");
        }
        else{
            System.out.println("Arguments = "+args.length);
            for(int i=0;i<args.length;i++)
                System.out.println("args["+i+"] = "+args[i]);
        }
    }
}
