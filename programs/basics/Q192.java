// Q192
package basics;
public class Q192 {
    public static void main(String[] args) {
        int a[] = {45,89,23,89,67,91,12};
        int f = a[0], s = -1;
        for(int i=1;i<a.length;i++){
            if(a[i]>f){
                s = f;
                f = a[i];
            }
            else if(a[i]>s && a[i]!=f)
                s = a[i];
        }
        System.out.println("Largest = "+f);
        System.out.println("Second largest = "+s);
    }
}
