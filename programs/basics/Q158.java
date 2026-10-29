// Q158
package basics;
import java.util.Scanner;
public class Q158 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = kb.next().charAt(0);
        // lowercase me convert kar liya taki A aur a dono chal jaye
        char c = Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            System.out.println(ch+" is a vowel");
        else
            System.out.println(ch+" is a consonant");
    }
}
