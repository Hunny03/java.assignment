// Q024
package functions;
public class Q024 {
    static int smallest(int a, int b, int c){
        if(a<b && a<c) return a;
        else if(b<c) return b;
        else return c;
    }
    public static void main(String[] args) {
        System.out.println("Smallest among 27, 14, and 39 = "+smallest(27,14,39));
    }
}
