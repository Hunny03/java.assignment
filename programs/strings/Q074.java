// Q074
package strings;
public class Q074 {
    public static void main(String[] args) {
        String s = "Hello World 123 Java";
        String n = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                n = n + Character.toLowerCase(c);
            else if(Character.isLowerCase(c))
                n = n + Character.toUpperCase(c);
            else
                n = n + c;
        }
        System.out.println("Before: "+s);
        System.out.println("After: "+n);
    }
}
