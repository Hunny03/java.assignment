// Q048
package strings;
public class Q048 {
    public static void main(String[] args) {
        String s = "apple,banana,cherry,dates";
        String a[] = s.split(",");
        System.out.println("String array:");
        for(int i=0;i<a.length;i++)
            System.out.println(i+" -> "+a[i]);
    }
}
