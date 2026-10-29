// Q361
package oop;
public class Q361 {
    static class Student {
        String name, grade;
        String courses[] = new String[10];
        int n = 0;
        Student(String name, String grade){ this.name=name; this.grade=grade; }
        void addCourse(String c){ courses[n] = c; n++; }
        void removeCourse(String c){
            for(int i=0;i<n;i++){
                if(courses[i].equals(c)){
                    for(int j=i;j<n-1;j++) courses[j] = courses[j+1];
                    n--;
                    break;
                }
            }
        }
        void show(){
            System.out.print(name+" (grade "+grade+") courses: ");
            for(int i=0;i<n;i++) System.out.print(courses[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Student s = new Student("Mehak","A");
        s.addCourse("Java");
        s.addCourse("Maths");
        s.addCourse("Physics");
        s.show();
        s.removeCourse("Maths");
        s.show();
    }
}
