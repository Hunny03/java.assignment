// Q364
package oop;
public class Q364 {
    static class Inventory {
        String item[] = new String[10];
        int qty[] = new int[10];
        int n = 0;
        void addProduct(String name, int q){
            for(int i=0;i<n;i++){
                if(item[i].equals(name)){
                    qty[i] = qty[i] + q;
                    return;
                }
            }
            item[n] = name;
            qty[n] = q;
            n++;
        }
        void sell(String name, int q){
            for(int i=0;i<n;i++){
                if(item[i].equals(name))
                    qty[i] = qty[i] - q;
            }
        }
        void removeProduct(String name){
            for(int i=0;i<n;i++){
                if(item[i].equals(name)){
                    for(int j=i;j<n-1;j++){
                        item[j] = item[j+1];
                        qty[j] = qty[j+1];
                    }
                    n--;
                    break;
                }
            }
        }
        void checkLowInventory(){
            System.out.println("Items with low stock (5 or fewer):");
            for(int i=0;i<n;i++){
                if(qty[i]<=5)
                    System.out.println("  "+item[i]+" -> "+qty[i]);
            }
        }
    }
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct("Notebook",40);
        inv.addProduct("Pen",12);
        inv.addProduct("Stapler",8);
        inv.sell("Pen",9);
        inv.sell("Stapler",4);
        inv.checkLowInventory();
        inv.removeProduct("Pen");
        inv.checkLowInventory();
    }
}
