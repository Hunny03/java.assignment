// Q216
package basics;
import java.util.Scanner;
public class Q216 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amt = kb.nextInt();
        int note[] = {500,200,100,50,20,10,5,2,1};
        int tot = 0;
        for(int i=0;i<note.length;i++){
            int c = amt/note[i];
            if(c>0){
                System.out.println("Rs "+note[i]+" x "+c);
                tot = tot + c;
                amt = amt%note[i];
            }
        }
        System.out.println("Total notes/coins = "+tot);
    }
}
