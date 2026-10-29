// Q042
package strings;
public class Q042 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(5,",");
        sb.insert(0,">> ");
        System.out.println("After insertion: "+sb);
    }
}
