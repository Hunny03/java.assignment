// Q049
package strings;
import java.util.Scanner;
public class Q049 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Sentence: ");
        String s = kb.nextLine().trim();
        int c = 0;
        if(s.length()>0){
            String w[] = s.split("\\s+");
            c = w.length;
        }
        System.out.println("Words = "+c);
    }
}
