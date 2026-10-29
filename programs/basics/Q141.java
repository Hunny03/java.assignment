// Q141
package basics;
import java.util.Scanner;
public class Q141 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char c = kb.next().charAt(0);
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            System.out.println("It is a vowel");
        else if(c>='a' && c<='z')
            System.out.println("It is a consonant");
        else
            System.out.println("This is not an alphabetic character");
    }
}
