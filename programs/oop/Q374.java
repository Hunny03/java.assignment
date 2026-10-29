// Q374
package oop;
import java.util.Scanner;
public class Q374 {
    static class Student {
        static int count = 1;      // static hai isliye sab objects me shared, roll number auto
        int roll;
        String name, cls;
        Student(String name, String cls){
            roll = count;
            count++;
            this.name = name;
            this.cls = cls;
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Student s[] = new Student[10];
        for(int i=0;i<10;i++){
            System.out.print("Student "+(i+1)+" name: ");
            String n = kb.next();
            System.out.print("Student "+(i+1)+" class: ");
            String c = kb.next();
            s[i] = new Student(n,c);
        }
        System.out.println("\nRoll   Name     Class");
        for(int i=0;i<10;i++)
            System.out.println(s[i].roll+"      "+s[i].name+"     "+s[i].cls);
    }
}
