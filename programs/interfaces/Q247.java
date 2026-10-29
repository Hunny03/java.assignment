// Q247
package interfaces;
public class Q247 {
    interface Searchable {
        void search(String key);
    }
    static class Document implements Searchable {
        String text;
        Document(String text){ this.text = text; }
        public void search(String key){
            int c = 0;
            String t = text.toLowerCase();
            String k = key.toLowerCase();
            for(int i=0;i+k.length()<=t.length();i++){
                if(t.substring(i,i+k.length()).equals(k)) c++;
            }
            System.out.println("The word \""+key+"\" appears "+c+" times");
        }
    }
    static class WebPage implements Searchable {
        String head[] = {"Intro to Java","Python basics","Advanced Java topics"};
        public void search(String key){
            System.out.println("Headings on the webpage containing \""+key+"\":");
            for(int i=0;i<head.length;i++){
                if(head[i].toLowerCase().contains(key.toLowerCase()))
                    System.out.println("  "+head[i]);
            }
        }
    }
    public static void main(String[] args) {
        Searchable s1 = new Document("Java is simple. Learn Java by building Java programs.");
        Searchable s2 = new WebPage();
        s1.search("java");
        s2.search("java");
    }
}
