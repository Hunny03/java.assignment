// Q063
package strings;
public class Q063 {
    public static void main(String[] args) {
        String s = "Programming with Java is genuinely enjoyable";
        String w[] = s.split(" ");
        String big = w[0], small = w[0];
        for(int i=1;i<w.length;i++){
            if(w[i].length()>big.length()) big = w[i];
            if(w[i].length()<small.length()) small = w[i];
        }
        System.out.println("Shortest word = "+small);
        System.out.println("Longest word = "+big);
    }
}
