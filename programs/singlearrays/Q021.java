// Q021
package singlearrays;
public class Q021 {
    public static void main(String[] args) {
        int a[] = {4,9,4,2,9,7,2,1};
        int b[] = new int[a.length];
        int k = 0;
        for(int i=0;i<a.length;i++){
            int found = 0;
            for(int j=0;j<k;j++){
                if(b[j]==a[i]) found = 1;
            }
            if(found==0){
                b[k] = a[i];
                k++;
            }
        }
        System.out.print("After removing duplicates: ");
        for(int i=0;i<k;i++) System.out.print(b[i]+" ");
        System.out.println();
    }
}
