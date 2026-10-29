// Q185
package basics;
public class Q185 {
    public static void main(String[] args) {
        int a[] = {47,12,93,5,68,81};
        int max = a[0], min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max) max = a[i];
            if(a[i]<min) min = a[i];
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
