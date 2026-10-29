// Q238
package basics;
import java.util.Scanner;
public class Q238 {
    static float rounded(float x){
        return (float)Math.round(x);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Float value: ");
        float f = kb.nextFloat();
        System.out.println("Rounded = "+rounded(f));
    }
}
