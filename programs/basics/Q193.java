// Q193
package basics;
public class Q193 {
    public static void main(String[] args) {
        int a[] = {45,89,23,12,67,12,91};
        int f = a[0], s = 9999;
        for(int i=1;i<a.length;i++){
            if(a[i]<f){
                s = f;
                f = a[i];
            }
            else if(a[i]<s && a[i]!=f)
                s = a[i];
        }
        System.out.println("Smallest = "+f);
        System.out.println("Second smallest = "+s);
    }
}
