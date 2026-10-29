// Q271
package inheritance;
public class Q271 {
    static class Printer {
        void printLine(){ System.out.println("Printer: printing a normal line"); }
    }
    static class ColorPrinter extends Printer {
        void printLine(){
            super.printLine();      // pehle parent wala kaam
            System.out.println("ColorPrinter: color printing is now enabled");
        }
    }
    public static void main(String[] args) {
        ColorPrinter c = new ColorPrinter();
        c.printLine();
    }
}
