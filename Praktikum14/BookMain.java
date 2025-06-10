import java.util.Stack;

public class BookMain {
    public static void main(String[] args) {
        Stack<Book> books = new Stack<>();

        Book book1 = new Book("1213", "Dasar Pemrograman");
        Book book2 = new Book("1214", "Hafalan");
        Book book3 = new Book("1215", "Dayummmm");

        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book temp = books.peek();

        if (temp != null){
            System.out.println(temp.toString());
        }

        Book temp2 = books.pop();

        if (temp2 != null){
            System.out.println(temp2.toString());
        }
    }
}
