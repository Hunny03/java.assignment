// Q057
package strings;
public class Q057 {
    static void make(String front, String back){
        if(back.length()==0){
            System.out.print(front+" ");
            return;
        }
        for(int i=0;i<back.length();i++){
            make(front+back.charAt(i), back.substring(0,i)+back.substring(i+1));
        }
    }
    public static void main(String[] args) {
        System.out.println("Permutations of ABC:");
        make("","ABC");
        System.out.println();
    }
}
