// Q249
package interfaces;
public class Q249 {
    interface Sortable {
        void sort(int a[]);     // descending
    }
    static class QuickSort implements Sortable {
        public void sort(int a[]){
            quick(a,0,a.length-1);
        }
        void quick(int a[], int lo, int hi){
            if(lo>=hi) return;
            int p = a[hi];
            int k = lo;
            for(int i=lo;i<hi;i++){
                if(a[i]>p){
                    int t = a[i]; a[i] = a[k]; a[k] = t;
                    k++;
                }
            }
            int t = a[hi]; a[hi] = a[k]; a[k] = t;
            quick(a,lo,k-1);
            quick(a,k+1,hi);
        }
    }
    static class MergeSort implements Sortable {
        public void sort(int a[]){
            if(a.length<2) return;
            int m = a.length/2;
            int l[] = new int[m];
            int r[] = new int[a.length-m];
            for(int i=0;i<m;i++) l[i] = a[i];
            for(int i=m;i<a.length;i++) r[i-m] = a[i];
            sort(l);
            sort(r);
            int i=0, j=0, k=0;
            while(i<l.length && j<r.length){
                if(l[i]>=r[j]) a[k++] = l[i++];
                else a[k++] = r[j++];
            }
            while(i<l.length) a[k++] = l[i++];
            while(j<r.length) a[k++] = r[j++];
        }
    }
    static void show(int a[]){
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int x[] = {38,5,91,17,62,24,70};
        int y[] = {38,5,91,17,62,24,70};
        new QuickSort().sort(x);
        new MergeSort().sort(y);
        System.out.print("Quick sort: ");
        show(x);
        System.out.print("Merge sort: ");
        show(y);
    }
}
