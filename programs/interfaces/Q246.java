// Q246
package interfaces;
public class Q246 {
    interface Playable {
        void play();
    }
    static class Football implements Playable {
        public void play(){ System.out.println("Football: 11 players kick the ball"); }
    }
    static class Volleyball implements Playable {
        public void play(){ System.out.println("Volleyball: hit the ball over the net"); }
    }
    static class Basketball implements Playable {
        public void play(){ System.out.println("Basketball: throw the ball into the basket"); }
    }
    public static void main(String[] args) {
        Playable p[] = {new Football(), new Volleyball(), new Basketball()};
        for(int i=0;i<p.length;i++)
            p[i].play();
    }
}
