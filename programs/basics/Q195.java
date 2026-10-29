// Q195
package basics;
public class Q195 {
    public static void main(String[] args) {
        int a[] = {152,178,165,190,143,171};
        int max = a[0], min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max) max = a[i];
            if(a[i]<min) min = a[i];
        }
        System.out.println("Largest = "+max);
        System.out.println("Smallest = "+min);
        System.out.println("Difference = "+(max-min));
    }
}
