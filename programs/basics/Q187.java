// Q187
package basics;
public class Q187 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int i = 0, j = a.length-1;
        while(i<j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        System.out.print("Reversed array: ");
        for(int k=0;k<a.length;k++)
            System.out.print(a[k]+" ");
        System.out.println();
    }
}
