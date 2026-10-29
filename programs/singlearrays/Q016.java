// Q016
package singlearrays;
public class Q016 {
    public static void main(String[] args) {
        int a[] = {34,91,17,68,85,52};
        // pehle descending sort kiya fir teesra element utha liya
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("3rd largest = "+a[2]);
    }
}
