// Q020
package singlearrays;
public class Q020 {
    public static void main(String[] args) {
        int a[] = {34,91,17,68,85,52};
        int small = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<small) small = a[i];
        }
        System.out.println("Smallest = "+small);
    }
}
