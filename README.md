# 📚 Book Catalog

A simple **Java console-based Book Catalog application** that allows users to add books, search for books by title, and view all available books. The catalog is stored in a text file so that the books remain available even after the program is closed.

## ✨ Features

* ➕ Add a new book
* 🔍 Search for a book by title
* 📖 List all books
* 💾 Save books to a text file
* 📂 Load saved books when the program starts
* 🖥️ Simple command-line interface

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **File Handling**
* **Scanner**
* **Object-Oriented Programming (OOP)**

## 📁 Project Structure

```text
Book-Catalog/
│
├── Main.java
├── Books.java
├── books.txt
└── README.md
```

### `Books.java`

Contains the `Books` class, which stores:

* Book title
* Book author

### `Main.java`

Contains the main program and implements:

* Adding books
* Searching books
* Listing books
* Saving books to a file
* Loading books from a file
* Menu and user interaction

### `books.txt`

Stores the book catalog so that data is not lost when the program closes.

Example:

```text
Harry Potter|J.K. Rowling
The Hobbit|J.R.R. Tolkien
Atomic Habits|James Clear
```

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Open the project

Open the project in your preferred Java IDE, such as:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### 3. Compile the program

```bash
javac Main.java Books.java
```

### 4. Run the program

```bash
java Main
```

## 🎮 How to Use

When the program starts, you will see:

```text
1. Add a book
2. Search for a book by title
3. List all books
4. Exit

Choose an option:
```

### Add a Book

Select `1` and enter the book title and author.

```text
Enter the title of the book:
Harry Potter

Enter the author of the book:
J.K. Rowling
```

The book will be added to the catalog and saved to the text file.

### Search for a Book

Select `2` and enter the title you want to search for.

```text
Enter the title to search:
Harry Potter

Book found: Harry Potter by J.K. Rowling
```

### List All Books

Select `3` to display all books:

```text
List of all books:
Harry Potter by J.K. Rowling
The Hobbit by J.R.R. Tolkien
```

### Exit

Select `4` to exit the program.

The catalog is stored in `books.txt` and can be loaded again when the program is started.

## 💾 File Handling

The project uses Java file handling to provide data persistence.

### Saving

The `saveBooks()` method writes the books from the `ArrayList` to `books.txt`.

```text
ArrayList<Books>
       ↓
  saveBooks()
       ↓
  books.txt
```

### Loading

The `loadBooks()` method reads the saved books from `books.txt` when the program starts.

```text
  books.txt
       ↓
  loadBooks()
       ↓
ArrayList<Books>
```

## 📌 Future Improvements

Some features that could be added in the future:

* Delete a book
* Update book information
* Search by author
* Prevent duplicate books
* Add book IDs
* Improve input validation
* Use a database instead of a text file
* Add a graphical user interface (GUI)

## 👨‍💻 Author

**Shagun Vashishtha**

This project was created as a Java practice project to learn **Object-Oriented Programming, ArrayList, user input, and file handling**.
