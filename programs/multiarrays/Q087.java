// Q087
package multiarrays;
import java.util.Scanner;
public class Q087 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int r = kb.nextInt();
        int c = kb.nextInt();
        int m[][] = new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                m[i][j] = kb.nextInt();
        }
        System.out.println("Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(m[i][j]+"  ");
            System.out.println();
        }
    }
}
