// Q258
package packages;
import packages.c4.sample.Cabinet;      // package ke andar package: packages -> c4 -> sample
public class Q258 {
    static class Furniture extends Cabinet {
        void dikha(){
            drawers = drawers + 2;
            System.out.println(label());
        }
    }
    public static void main(String[] args) {
        Furniture f = new Furniture();
        f.dikha();
    }
}
