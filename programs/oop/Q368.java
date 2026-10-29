// Q368
package oop;
public class Q368 {
    static class Movie {
        String title, director;
        String actors[];
        String reviews[] = new String[10];
        int n = 0;
        Movie(String title, String director, String actors[]){
            this.title = title;
            this.director = director;
            this.actors = actors;
        }
        void addReview(String r){ reviews[n] = r; n++; }
        void show(){
            System.out.print(title+" (director: "+director+") actors: ");
            for(int i=0;i<actors.length;i++) System.out.print(actors[i]+", ");
            System.out.println();
            for(int i=0;i<n;i++)
                System.out.println("  Review "+(i+1)+": "+reviews[i]);
        }
    }
    public static void main(String[] args) {
        String a[] = {"Aamir Khan","R. Madhavan","Sharman Joshi"};
        Movie m = new Movie("3 Idiots","Rajkumar Hirani",a);
        m.addReview("Funny aur dil ko chhune wali");
        m.addReview("Passion follow karne ka accha message");
        m.show();
        System.out.println("Total reviews = "+m.n);
    }
}
