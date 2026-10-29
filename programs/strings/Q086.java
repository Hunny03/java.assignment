// Q086
package strings;
public class Q086 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java Programming");
        System.out.println("Start: "+sb);
        sb.append(" Language");
        System.out.println("append: "+sb);
        sb.insert(5,"Core ");
        System.out.println("insert: "+sb);
        sb.delete(5,10);
        System.out.println("delete: "+sb);
        sb.replace(0,4,"JAVA");
        System.out.println("replace: "+sb);
    }
}
