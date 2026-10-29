// Q098
package multiarrays;
public class Q098 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // diagonal ke upar wale ko neeche wale se swap
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
        System.out.println("Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }
    }
}
