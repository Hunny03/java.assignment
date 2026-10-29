// Q279
package inheritance;
public class Q279 {
    static abstract class Shape3D {
        abstract double calculateVolume();
        abstract double calculateSurfaceArea();
    }
    static class Sphere extends Shape3D {
        double r;
        Sphere(double r){ this.r=r; }
        double calculateVolume(){ return (4.0/3)*3.14159*r*r*r; }
        double calculateSurfaceArea(){ return 4*3.14159*r*r; }
    }
    static class Cube extends Shape3D {
        double s;
        Cube(double s){ this.s=s; }
        double calculateVolume(){ return s*s*s; }
        double calculateSurfaceArea(){ return 6*s*s; }
    }
    public static void main(String[] args) {
        Shape3D a[] = {new Sphere(5), new Cube(4)};
        for(int i=0;i<a.length;i++)
            System.out.println("Volume = "+a[i].calculateVolume()+", Surface area = "+a[i].calculateSurfaceArea());
    }
}
