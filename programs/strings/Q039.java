// Q039
package strings;
public class Q039 {
    public static void main(String[] args) {
        String s = "Java";
        String s2 = s;
        s.concat(" Rocks");      // ye s ko change nahi karta
        System.out.println("s = "+s);
        s = s.concat(" Rocks");  // naya object bana aur s ab usko point karta hai
        System.out.println("s = "+s);
        System.out.println("Original s2 = "+s2);
        System.out.println("The original string stays unchanged because strings are immutable");
    }
}
