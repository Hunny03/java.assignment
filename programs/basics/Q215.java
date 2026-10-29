// Q215
package basics;
public class Q215 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 600:");
        for(int i=1;i<=600;i++){
            int t = i, d = 0;
            while(t>0){
                d++;
                t = t/10;
            }
            t = i;
            int s = 0;
            while(t>0){
                int r = t%10;
                int p = 1;
                for(int k=1;k<=d;k++)
                    p = p*r;
                s = s + p;
                t = t/10;
            }
            if(s==i)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
