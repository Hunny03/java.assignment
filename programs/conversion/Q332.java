// Q332
package conversion;
public class Q332 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(0);         // pehla character
        char a[] = s.toCharArray();   // poore characters ka array
        System.out.println("First character = "+c);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
