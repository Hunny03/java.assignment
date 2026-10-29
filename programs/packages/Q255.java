// Q255
package packages;
import packages.q255.Addition;
import packages.q255.Subtraction;
import packages.q255.Multiplication;
import packages.q255.Division;
public class Q255 {
    public static void main(String[] args) {
        // objects dusre package ki classes ke, alag file me bana rahe hai
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        System.out.println("Addition = "+a.kar(48,12));
        System.out.println("Subtraction = "+s.kar(48,12));
        System.out.println("Multiplication = "+m.kar(48,12));
        System.out.println("Division = "+d.kar(48,12));
    }
}
