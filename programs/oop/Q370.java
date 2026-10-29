// Q370
package oop;
import java.util.ArrayList;
public class Q370 {
    static class TravelDesk {
        String flights[] = {"Delhi->Goa","Delhi->Pune","Mumbai->Goa"};
        String hotels[] = {"Goa: Sea Breeze","Goa: Palm Inn","Pune: Orchid Stay"};
        ArrayList<String> bookings = new ArrayList<String>();
        void searchFlights(String dest){
            System.out.println("Flights to "+dest+":");
            for(int i=0;i<flights.length;i++){
                if(flights[i].endsWith(dest))
                    System.out.println("  "+flights[i]);
            }
        }
        void searchHotels(String city){
            System.out.println("Hotels in "+city+":");
            for(int i=0;i<hotels.length;i++){
                if(hotels[i].startsWith(city))
                    System.out.println("  "+hotels[i]);
            }
        }
        void book(String x){
            bookings.add(x);
            System.out.println("Booked: "+x);
        }
        void cancel(String x){
            if(bookings.remove(x))
                System.out.println("Cancelled: "+x);
            else
                System.out.println("No such booking exists: "+x);
        }
    }
    public static void main(String[] args) {
        TravelDesk t = new TravelDesk();
        t.searchFlights("Goa");
        t.searchHotels("Goa");
        t.book("Delhi->Goa");
        t.book("Goa: Palm Inn");
        t.cancel("Goa: Palm Inn");
        t.cancel("Goa: Sea Breeze");
    }
}
