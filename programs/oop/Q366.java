// Q366
package oop;
import java.util.ArrayList;
import java.util.Random;
public class Q366 {
    static class MusicLibrary {
        ArrayList<String> songs = new ArrayList<String>();
        Random r = new Random(7);      // seed fix hai taaki har baar same output aaye
        void addSong(String s){ songs.add(s); }
        void removeSong(String s){ songs.remove(s); }
        void playRandom(){
            if(songs.size()==0)
                System.out.println("No songs available");
            else{
                int i = r.nextInt(songs.size());
                System.out.println("Now playing: "+songs.get(i));
            }
        }
    }
    public static void main(String[] args) {
        MusicLibrary m = new MusicLibrary();
        m.addSong("Tum Hi Ho");
        m.addSong("Kun Faya Kun");
        m.addSong("Chaiyya Chaiyya");
        m.addSong("Ae Dil Hai Mushkil");
        m.removeSong("Kun Faya Kun");
        for(int i=0;i<3;i++)
            m.playRandom();
    }
}
