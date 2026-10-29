// Q189
package basics;
public class Q189 {
    public static void main(String[] args) {
        int a[] = {4,9,4,7,9,1,4,6};
        System.out.print("Duplicate values: ");
        for(int i=0;i<a.length;i++){
            int cnt = 0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]) cnt++;
            }
            // ek baar hi print ho isliye pehli baar wale par hi dekha
            int pehle = 0;
            for(int k=0;k<i;k++){
                if(a[k]==a[i]) pehle = 1;
            }
            if(cnt>1 && pehle==0)
                System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
