// Q058
package strings;
public class Q058 {
    public static void main(String[] args) {
        String s = "mississippi river";
        int cnt[] = new int[256];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                cnt[s.charAt(i)]++;
        }
        int max = 0, min = 999;
        char mx = ' ', mn = ' ';
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' ') continue;
            if(cnt[c]>max){
                max = cnt[c];
                mx = c;
            }
            if(cnt[c]<min){
                min = cnt[c];
                mn = c;
            }
        }
        System.out.println("Most frequent: "+mx+" ("+max+" baar)");
        System.out.println("Least frequent: "+mn+" ("+min+" baar)");
    }
}
