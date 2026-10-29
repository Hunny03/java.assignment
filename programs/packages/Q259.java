// Q259
package packages;
import packages.q259.Greeter;
public class Q259 {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.name = "dusra package";      // public hai isliye kahin se bhi badal sakte hai
        g.sayHello();
    }
}
