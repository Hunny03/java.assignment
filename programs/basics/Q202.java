// Q202
package basics;
public class Q202 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6}};
        int t[][] = new int[3][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                t[j][i] = a[i][j];
            }
        }
        System.out.println("Original:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++)
                System.out.print(t[i][j]+" ");
            System.out.println();
        }
    }
}
