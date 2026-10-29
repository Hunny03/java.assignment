// Q372
package oop;
public class Q372 {
    static class Student {
        String name;
        int marks;
        Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }
        void show(){ System.out.println(name+"'s marks = "+marks); }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Gurleen",88);
        Student s2 = new Student("Kabir",73);
        s1.show();
        s2.show();
    }
}
