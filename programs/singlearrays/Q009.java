// Q009
package singlearrays;
public class Q009 {
    public static void main(String[] args) {
        int a[] = {62,118,74,99,143,87};
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max)
                max = a[i];
        }
        System.out.println("Largest = "+max);
    }
}
