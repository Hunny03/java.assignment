// Q181
package basics;
public class Q181 {
    public static void main(String[] args) {
        int a[] = {120,340,75,410,60,225};
        int s = 0;
        for(int i=0;i<a.length;i++)
            s = s + a[i];
        System.out.println("Array sum = "+s);
    }
}
