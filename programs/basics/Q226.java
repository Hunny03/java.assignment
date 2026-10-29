// Q226
package basics;
public class Q226 {
    // regular pentagon ka area = 1.72048 * side * side
    static double area(double s){
        return 1.72048*s*s;
    }
    public static void main(String[] args) {
        System.out.println("Area of a pentagon with side length 8 = "+area(8));
    }
}
