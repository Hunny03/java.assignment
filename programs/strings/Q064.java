// Q064
package strings;
public class Q064 {
    public static void main(String[] args) {
        String s = "banana bandana";
        String best = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                int k = 0;
                // i aur j se shuru hokar kitna match karta hai (overlap nahi hona chahiye)
                while(j+k<s.length() && s.charAt(i+k)==s.charAt(j+k) && i+k<j)
                    k++;
                if(k>best.length())
                    best = s.substring(i,i+k);
            }
        }
        System.out.println("Longest repeating sequence = "+best);
    }
}
