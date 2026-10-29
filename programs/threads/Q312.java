// Q312
package threads;
public class Q312 {
    static int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
    static int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
    static int c[][] = new int[3][3];

    // har row ke liye alag thread
    static class RowThread extends Thread {
        int r;
        RowThread(int r){ this.r = r; }
        public void run(){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++)
                    c[r][j] = c[r][j] + a[r][k]*b[k][j];
            }
        }
    }
    public static void main(String[] args) throws Exception {
        RowThread t[] = new RowThread[3];
        for(int i=0;i<3;i++){
            t[i] = new RowThread(i);
            t[i].start();
        }
        for(int i=0;i<3;i++)
            t[i].join();
        System.out.println("Multiplication:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(c[i][j]+"  ");
            System.out.println();
        }
    }
}
