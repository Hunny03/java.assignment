// Q072
package strings;
public class Q072 {
    static boolean palin(String s){
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
            r = r + s.charAt(i);
        return r.equals(s);
    }
    public static void main(String[] args) {
        String s = "madam saw a level racecar and noon at civic wow";
        String w[] = s.split(" ");
        String big = "", small = "";
        for(int i=0;i<w.length;i++){
            if(palin(w[i])){
                if(small.equals("") || w[i].length()<small.length()) small = w[i];
                if(w[i].length()>big.length()) big = w[i];
            }
        }
        System.out.println("Shortest palindrome = "+small);
        System.out.println("Longest palindrome = "+big);
    }
}
