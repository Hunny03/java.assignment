// Q201
package basics;
public class Q201 {
    public static void main(String[] args) {
        String n[] = {"Varun","Ishita","Dhruv","Anaya","Kabir"};
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i].compareTo(n[j])>0){
                    String t = n[i];
                    n[i] = n[j];
                    n[j] = t;
                }
            }
        }
        System.out.println("Alphabetical order in:");
        for(int i=0;i<n.length;i++)
            System.out.println(n[i]);
    }
}
