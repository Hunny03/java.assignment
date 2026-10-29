// Q019
package singlearrays;
public class Q019 {
    public static void main(String[] args) {
        int a[] = {34,91,17,68,85,52};
        int f = 9999, s = 9999;
        for(int i=0;i<a.length;i++){
            if(a[i]<f){
                s = f;
                f = a[i];
            }
            else if(a[i]<s)
                s = a[i];
        }
        System.out.println("2nd smallest = "+s);
    }
}
