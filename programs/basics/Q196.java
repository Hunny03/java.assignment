// Q196
package basics;
public class Q196 {
    public static void main(String[] args) {
        int a[] = {1,0,1,1,0,0,1,0};
        // pehle zeros ginte hai fir pehle zeros likhte hai baaki me ones
        int z = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) z++;
        }
        for(int i=0;i<a.length;i++){
            if(i<z) a[i] = 0;
            else a[i] = 1;
        }
        System.out.print("Result: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
