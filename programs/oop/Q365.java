// Q365
package oop;
import java.util.ArrayList;
public class Q365 {
    static class School {
        ArrayList<String> students = new ArrayList<String>();
        ArrayList<String> teachers = new ArrayList<String>();
        ArrayList<String> classes = new ArrayList<String>();
        void addStudent(String s){ students.add(s); }
        void removeStudent(String s){ students.remove(s); }
        void addTeacher(String t){ teachers.add(t); }
        void removeTeacher(String t){ teachers.remove(t); }
        void createClass(String c, String t){
            if(teachers.contains(t))
                classes.add(c+" - "+t);
            else
                System.out.println(c+" cannot be created because "+t+" is not in the teacher list");
        }
        void show(){
            System.out.println("Students: "+students);
            System.out.println("Teachers: "+teachers);
            System.out.println("Classes: "+classes);
        }
    }
    public static void main(String[] args) {
        School s = new School();
        s.addStudent("Jatin");
        s.addStudent("Lavleen");
        s.addStudent("Ojas");
        s.addTeacher("Mrs. Bedi");
        s.addTeacher("Mr. Chopra");
        s.createClass("Class 10-A","Mrs. Bedi");
        s.createClass("Class 12-B","Mr. Gill");
        s.removeStudent("Ojas");
        s.show();
    }
}
