// Q002
package singlearrays;
public class Q002 {
    public static void main(String[] args) {
        int a[] = {3,7,3,9,7,3,1,9};
        int visit[] = new int[a.length];     // jo gin liya uska 1
        System.out.println("Element   Frequency");
        for(int i=0;i<a.length;i++){
            if(visit[i]==1) continue;
            int c = 1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    visit[j] = 1;
                }
            }
            System.out.println(a[i]+"         "+c);
        }
    }
}
