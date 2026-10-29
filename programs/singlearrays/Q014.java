// Q014
package singlearrays;
public class Q014 {
    public static void main(String[] args) {
        int a[] = {52,9,71,33,18,64};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("Ascending: ");
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
}
