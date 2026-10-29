// Q046
package strings;
import java.util.Scanner;
public class Q046 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        int flag = 1;
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = 0;
                break;
            }
            i++;
            j--;
        }
        if(flag==1)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }
}
