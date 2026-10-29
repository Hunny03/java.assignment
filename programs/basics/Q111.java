// Q111
package basics;
import java.util.Scanner;
public class Q111 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = kb.nextLine();
        int l=0, d=0, sp=0, oth=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)) l++;
            else if(Character.isDigit(c)) d++;
            else if(c==' ') sp++;
            else oth++;
        }
        System.out.println("Letters = "+l);
        System.out.println("Numbers = "+d);
        System.out.println("Spaces = "+sp);
        System.out.println("Other = "+oth);
    }
}
