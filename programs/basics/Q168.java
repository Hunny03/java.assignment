// Q168
package basics;
public class Q168 {
    public static void main(String[] args) {
        String s1 = "Good ";
        String s2 = "Morning";
        String s3 = s1 + s2;           // + se jodna
        String s4 = s1.concat(s2);     // concat se jodna
        System.out.println(s3);
        System.out.println(s4);
    }
}
