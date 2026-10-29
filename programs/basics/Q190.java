// Q190
package basics;
import java.util.ArrayList;
import java.util.Arrays;
public class Q190 {
    public static void main(String[] args) {
        String a[] = {"Pune","Jaipur","Kochi","Bhopal"};
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<a.length;i++)
            list.add(a[i]);
        System.out.println("Array = "+Arrays.toString(a));
        System.out.println("ArrayList = "+list);
    }
}
