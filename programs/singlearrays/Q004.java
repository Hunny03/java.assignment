// Q004
package singlearrays;
public class Q004 {
    public static void main(String[] args) {
        int a[] = {5,2,8,2,9,5,5,1};
        System.out.print("Duplicate elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[j]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
