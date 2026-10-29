// Q198
package basics;
public class Q198 {
    public static void main(String[] args) {
        int a[] = {4,7,4,9,2,7,5};
        System.out.print("Unique elements: ");
        for(int i=0;i<a.length;i++){
            int c = 0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]) c++;
            }
            if(c==1)
                System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
