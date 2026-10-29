// Q194
package basics;
public class Q194 {
    public static void main(String[] args) {
        int a[] = {101,202,303,404,505,606,707,818};
        int e = 0, o = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) e++;
            else o++;
        }
        System.out.println("Even = "+e);
        System.out.println("Odd = "+o);
    }
}
