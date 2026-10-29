// Q241
package interfaces;
public class Q241 {
    interface Flyable {
        void fly_obj();
    }
    static class Spacecraft implements Flyable {
        public void fly_obj(){ System.out.println("The spacecraft is flying through space"); }
    }
    static class Airplane implements Flyable {
        public void fly_obj(){ System.out.println("The airplane is flying through the air"); }
    }
    static class Helicopter implements Flyable {
        public void fly_obj(){ System.out.println("The helicopter flies using its rotors"); }
    }
    public static void main(String[] args) {
        Flyable f[] = {new Spacecraft(), new Airplane(), new Helicopter()};
        for(int i=0;i<f.length;i++)
            f[i].fly_obj();
    }
}
