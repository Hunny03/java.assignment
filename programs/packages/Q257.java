// Q257
package packages;
import packages.q257.Locker;
public class Q257 {
    // protected cheeze dusre package me bhi child class se mil jati hai
    static class Guard extends Locker {
        void dekho(){
            System.out.println("Guard checked the code: "+code);
            darwaza();
        }
    }
    public static void main(String[] args) {
        Guard g = new Guard();
        g.dekho();
    }
}
