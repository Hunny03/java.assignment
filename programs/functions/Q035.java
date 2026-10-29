// Q035
package functions;
public class Q035 {
    static boolean center(int a, int b, int c){
        // koi ek number baaki do ka average ho to true
        if(a*2==  b+c || b*2==a+c || c*2 ==a+b)
            return true;
        return   false;
    }
    public static void main(String[] args) {
        System.out.println("5,10,15  "+center(5,10,15));
        System.out.println("10,5,15  "+center(10,5,15));
        System.out.println("3,8,20  "+center(3,8,20));
    }
}
