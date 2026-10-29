// Q383
package oop;
public class Q383 {
    static class Student {
        private int student_id;
        private String student_name;
        private int grades[] = new int[10];
        private int n = 0;
        Student(int id, String name){
            student_id = id;
            student_name = name;
        }
        public int getStudent_id(){ return student_id; }
        public void setStudent_id(int id){ student_id = id; }
        public String getStudent_name(){ return student_name; }
        public void setStudent_name(String s){ student_name = s; }
        // grade 0 se 100 ke beech hi hona chahiye
        public void addGrade(int g){
            if(g<0 || g>100){
                System.out.println("Invalid grade: "+g);
                return;
            }
            grades[n] = g;
            n++;
        }
        public double average(){
            if(n==0) return 0;
            int s = 0;
            for(int i=0;i<n;i++) s = s + grades[i];
            return (double)s/n;
        }
        public void showGrades(){
            System.out.print("Grades: ");
            for(int i=0;i<n;i++) System.out.print(grades[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Student s = new Student(55,"Yuvraj");
        s.addGrade(82);
        s.addGrade(105);
        s.addGrade(-3);
        s.addGrade(91);
        System.out.println(s.getStudent_name()+" (id "+s.getStudent_id()+")");
        s.showGrades();
        System.out.println("Average = "+s.average());
    }
}
