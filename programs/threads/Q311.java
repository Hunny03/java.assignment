// Q311
package threads;
import java.util.Arrays;
public class Q311 {
    static class SortThread extends Thread {
        int a[], from, to;
        SortThread(int a[], int from, int to){
            this.a = a;
            this.from = from;
            this.to = to;
        }
        public void run(){
            // apni range ko sort karta hai
            for(int i=from;i<to;i++){
                for(int j=i+1;j<to;j++){
                    if(a[i]>a[j]){
                        int t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        int a[] = {88,14,62,3,97,45,21,70,9,33};
        System.out.println("Before: "+Arrays.toString(a));
        int mid = a.length/2;
        SortThread t1 = new SortThread(a,0,mid);
        SortThread t2 = new SortThread(a,mid,a.length);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // ab dono sorted hisse ko merge karte hai
        int b[] = new int[a.length];
        int i = 0, j = mid, k = 0;
        while(i<mid && j<a.length){
            if(a[i]<a[j]) b[k++] = a[i++];
            else b[k++] = a[j++];
        }
        while(i<mid) b[k++] = a[i++];
        while(j<a.length) b[k++] = a[j++];
        System.out.println("After: "+Arrays.toString(b));
    }
}
