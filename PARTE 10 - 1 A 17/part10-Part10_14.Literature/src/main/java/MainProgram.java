
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            books.add(new Book(name, age));
        }
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(books, comparator);
        System.out.println(books.size() + " books in total.");
        System.out.println();
        books.forEach(book -> System.out.println(book.toString()));
    }

}
