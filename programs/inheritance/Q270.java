// Q270
package inheritance;
public class Q270 {
    static class Parent {
        String label = "Parent ka label";
        Parent(){ System.out.println("Parent constructor called"); }
    }
    static class Child extends Parent {
        String label = "Child ka label";
        Child(){
            super();
            System.out.println("Child constructor called");
        }
        void show(){
            System.out.println("this.label = "+this.label);
            System.out.println("super.label = "+super.label);
        }
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
