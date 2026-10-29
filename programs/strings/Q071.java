// Q071
package strings;
public class Q071 {
    public static void main(String[] args) {
        String s = "Learning Java is really a good habit for every student";
        String w[] = s.split(" ");
        System.out.println("Words with even length:");
        for(int i=0;i<w.length;i++){
            if(w[i].length()%2==0)
                System.out.println(w[i]);
        }
    }
}
