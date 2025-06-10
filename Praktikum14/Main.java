import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Customer> newCustomers = new ArrayList<>();
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

        newCustomers.add(new Customer(12, "Okaa"));
        newCustomers.add(new Customer(13, "Ekaa"));
        newCustomers.add(new Customer(14, "Sandiyuda"));

        customers.addAll(newCustomers);

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));
        customers.add(2, new Customer(100, "Rosa"));
        System.out.println(customers.indexOf(customer2));

        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Handoko";

        for(Customer cust : customers){
            System.out.println(cust.toString());
        }

        for(Book book : books){
            System.out.println(book.toString());
        }

        System.out.println(books);
    }
}
