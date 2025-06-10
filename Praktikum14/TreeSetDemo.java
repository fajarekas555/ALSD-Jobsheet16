import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Isi TreeSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nfirst(): " + fruits.first());
        System.out.println("last(): " + fruits.last());

        fruits.remove("Mango");
        System.out.println("\nSetelah remove(\"Mango\"):");
        System.out.println(fruits);

        System.out.println("\npollFirst(): " + fruits.pollFirst());
        System.out.println("pollLast(): " + fruits.pollLast());

        System.out.println("\nIsi TreeSet setelah polling:");
        System.out.println(fruits);
    }
}
