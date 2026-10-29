// Q377
package oop;
public class Q377 {
    static class Person {
        private String name, country;
        private int age;
        public String getName(){ return name; }
        public void setName(String name){ this.name = name; }
        public int getAge(){ return age; }
        public void setAge(int age){ this.age = age; }
        public String getCountry(){ return country; }
        public void setCountry(String country){ this.country = country; }
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rhea");
        p.setAge(24);
        p.setCountry("India");
        System.out.println(p.getName()+", "+p.getAge()+", "+p.getCountry());
    }
}
