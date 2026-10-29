// Q121
package basics;
public class Q121 {
    public static void main(String[] args) {
        int a[] = {3,8,15,22,7,40,11,6};
        int ev=0, od=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) ev++;
            else od++;
        }
        System.out.println("Even = "+ev);
        System.out.println("Odd = "+od);
    }
}
