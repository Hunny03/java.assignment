// Q017
package singlearrays;
public class Q017 {
    public static void main(String[] args) {
        int a[] = {34,91,17,68,85,52};
        int f = 0, s = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>f){
                s = f;
                f = a[i];
            }
            else if(a[i]>s)
                s = a[i];
        }
        System.out.println("2nd largest = "+s);
    }
}
