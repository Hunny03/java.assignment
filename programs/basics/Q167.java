// Q167
package basics;
import java.util.Scanner;
public class Q167 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number, operator(+ - * / %), number: ");
        double a = kb.nextDouble();
        char op = kb.next().charAt(0);
        double b = kb.nextDouble();
        switch(op){
            case '+': System.out.println(a+b); break;
            case '-': System.out.println(a-b); break;
            case '*': System.out.println(a*b); break;
            case '/':
                if(b==0) System.out.println("Cannot divide by zero");
                else System.out.println(a/b);
                break;
            case '%': System.out.println(a%b); break;
            default: System.out.println("Invalid operator");
        }
    }
}
