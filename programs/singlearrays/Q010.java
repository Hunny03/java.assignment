// Q010
package singlearrays;
public class Q010 {
    public static void main(String[] args) {
        int a[] = {62,118,74,99,143,87};
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min)
                min = a[i];
        }
        System.out.println("Smallest = "+min);
    }
}
