// Q097
package multiarrays;
public class Q097 {
    public static void main(String[] args) {
        int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int flag = 1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j && a[i][j]!=1) flag = 0;
                if(i!=j && a[i][j]!=0) flag = 0;
            }
        }
        if(flag==1)
            System.out.println("It is an identity matrix");
        else
            System.out.println("It is not an identity matrix");
    }
}
