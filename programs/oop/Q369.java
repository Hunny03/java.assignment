// Q369
package oop;
public class Q369 {
    static class Restaurant {
        String dish[] = new String[10];
        double price[] = new double[10];
        double rating[] = new double[10];
        int n = 0;
        void addItem(String d, double p, double r){
            dish[n] = d;
            price[n] = p;
            rating[n] = r;
            n++;
        }
        void removeItem(String d){
            for(int i=0;i<n;i++){
                if(dish[i].equals(d)){
                    for(int j=i;j<n-1;j++){
                        dish[j] = dish[j+1];
                        price[j] = price[j+1];
                        rating[j] = rating[j+1];
                    }
                    n--;
                    break;
                }
            }
        }
        double avgRating(){
            double s = 0;
            for(int i=0;i<n;i++) s = s + rating[i];
            return s/n;
        }
        void show(){
            for(int i=0;i<n;i++)
                System.out.println("  "+dish[i]+"  Rs "+price[i]+"  rating "+rating[i]);
        }
    }
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.addItem("Butter Chicken",320,4.6);
        r.addItem("Dal Makhani",220,4.4);
        r.addItem("Paneer Tikka",280,4.1);
        r.addItem("Cold Coffee",120,3.5);
        r.show();
        System.out.println("Average rating = "+r.avgRating());
        r.removeItem("Cold Coffee");
        System.out.println("Average after removing Cold Coffee = "+r.avgRating());
    }
}
