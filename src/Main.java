
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

;

public class Main {

    public static List<Books> books = new ArrayList<>();
    public static final String BOOKS_FILE = "books.txt";

    public static void addBook(Scanner scanner) {
        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();
        System.out.println("Enter the author of the book:");
        String author = scanner.nextLine();
        Books book = new Books(title, author);
        books.add(book);
        saveBooks();
    }

    public static void searchBookByTitle(String title) {
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle() + " | " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("List of all books:");
        for (Books book : books) {
            System.out.println(book.getTitle() + " | " + book.getAuthor());
        }
    }

    public static void saveBooks() {
        try {
            FileWriter writer = new FileWriter(BOOKS_FILE);
            for (Books book : books) {
                writer.write(book.getTitle() + " | " + book.getAuthor() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occurred while saving books.");
        }
    }

    public static void loadBooks() {
        try {
            File file = new File(BOOKS_FILE);
            if (!file.exists()) {
                return;
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\| ");
                if (parts.length == 2) {
                    String title = parts[0].trim();
                    String author = parts[1].trim();
                    Books book = new Books(title, author);
                    books.add(book);
                }

            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred while loading books.");
        }
    }

    public static void main(String[] args) {
        loadBooks();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add a book");
            System.out.println("2. Search for a book by title");
            System.out.println("3. List all books");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    System.out.print("Enter the title to search: ");
                    String title = scanner.nextLine();
                    searchBookByTitle(title);
                    break;
                case 3:
                    listAllBooks();
                    break;
                case 4:
                    saveBooks();
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }

    }
}
