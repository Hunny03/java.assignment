// Q172
package basics;
import java.util.Scanner;
public class Q172 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        System.out.print("Start and end positions: ");
        int st = kb.nextInt();
        int en = kb.nextInt();
        // start wala include hota hai, end wala nahi
        if(st>=0 && en<=s.length() && st<=en)
            System.out.println("Substring = "+s.substring(st,en));
        else
            System.out.println("Invalid position");
    }
}
