// Q356
package oop;
public class Q356 {
    static class Book {
        String title, author, isbn;
        Book(String title, String author, String isbn){ this.title=title; this.author=author; this.isbn=isbn; }
    }
    static class BookCollection {
        Book b[] = new Book[10];
        int n = 0;
        void addBook(Book x){
            b[n] = x;
            n++;
        }
        void removeBook(String isbn){
            for(int i=0;i<n;i++){
                if(b[i].isbn.equals(isbn)){
                    for(int j=i;j<n-1;j++)
                        b[j] = b[j+1];     // baaki ko aage khiska diya
                    n--;
                    break;
                }
            }
        }
        void show(){
            for(int i=0;i<n;i++)
                System.out.println("  "+b[i].title+" by "+b[i].author+" ["+b[i].isbn+"]");
        }
    }
    public static void main(String[] args) {
        BookCollection c = new BookCollection();
        c.addBook(new Book("Clean Code","Robert Martin","111"));
        c.addBook(new Book("Effective Java","Joshua Bloch","222"));
        c.addBook(new Book("Head First Java","Kathy Sierra","333"));
        System.out.println("Collection:");
        c.show();
        c.removeBook("222");
        System.out.println("After removal:");
        c.show();
    }
}
