// Q091
package multiarrays;
public class Q091 {
    public static void main(String[] args) {
        int a[][] = {{1,2},{3,4}};
        int b[][] = {{1,2},{3,4}};
        int same = 1;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(a[i][j]!=b[i][j])
                    same = 0;
            }
        }
        if(same==1)
            System.out.println("The matrices are equal");
        else
            System.out.println("The matrices are not equal");
    }
}
