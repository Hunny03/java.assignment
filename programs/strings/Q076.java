// Q076
package strings;
public class Q076 {
    public static void main(String[] args) {
        String s = "Separate";
        char a[] = s.toCharArray();
        System.out.println("Distinct characters:");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
