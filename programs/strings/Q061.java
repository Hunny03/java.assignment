// Q061
package strings;
public class Q061 {
    public static void main(String[] args) {
        String s = "the cat saw the dog and the cat ran";
        String w[] = s.split(" ");
        System.out.println("Duplicate words:");
        for(int i=0;i<w.length;i++){
            int cnt = 1;
            int pehle = 0;
            for(int j=0;j<w.length;j++){
                if(j>i && w[j].equals(w[i])) cnt++;
                if(j<i && w[j].equals(w[i])) pehle = 1;
            }
            if(cnt>1 && pehle==0)
                System.out.println(w[i]+" -> "+cnt+" baar");
        }
    }
}
