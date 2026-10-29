// Q188
package basics;
public class Q188 {
    public static void main(String[] args) {
        int a[] = {3,8,12,17,21,30};
        int b[] = {5,12,21,28,30,44};
        System.out.print("Common elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                    System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
}
