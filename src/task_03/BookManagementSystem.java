package task_03;

import java.util.Scanner;

//Q1.Management System
//a.Design a Java program that uses OOP principles to model the Book.Create two classes: Book and Library. 
//The Book class should have attributes such as bookID, title, author, and isAvailable.
//The Library class should include an array to store book objects.
//b.Provide methods to add books, remove book ,search books (using id)and display books. Write a Java program that demonstrates the use of these classes and methods by allowing the
//user to interact with the library system.

class Book {

	int bookID;
	String title;
	String author;
	boolean isAvailable;
	
	public Book(int bookID,String title,String author,boolean isAvailable) {
		this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
	}
	
	// Getter method
	
	public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    
    // Setter method
    
    public void setBookID(int bookID) {
    	this.bookID = bookID;
    }

    public void setTitle(String title) {
    	this.title = title;
    }

    public void setAuthor(String author) {
    	this.author = author;
    }

    public void setisAvailable(boolean isAvailable) {
    	this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "{" +" Book ID = " + bookID +", title = '" + title + '\'' +", author = '" + author +
        		'\'' +", isAvailable = " + isAvailable +"}";
    }
	
}

class Library {

	private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookID() == bookID) {
                System.arraycopy(books, i + 1, books, i, numBooks - i - 1);
                numBooks--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        if (numBooks == 0) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Books in the library:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }

}


public class BookManagementSystem {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter book Capacity in Library : ");
		
		int n=s.nextInt();
		
        Library library = new Library(n);

        while (true) {
            System.out.println("\nLibrary Management System\t1. Add Book\t2. Remove Book\t3. Search Book\t4. Display Books\t5. Exit\n");
            
            int choice = s.nextInt();
            
            switch (choice) {
            
                case 1:
                    System.out.print("Enter book ID : ");
                    int id = s.nextInt();
                    
                    System.out.print("Enter book title : ");
                    String title = s.next();
                    
                    System.out.print("Enter author name: ");
                    String author = s.next();
                    
                    Book newBook = new Book(id, title, author, true);
                    
                    library.addBook(newBook);
                    break;
                    
                case 2:
                    System.out.print("Enter book ID to remove: ");
                    int removeId = s.nextInt();
                    library.removeBook(removeId);
                    break;
                    
                case 3:
                    System.out.print("Enter book ID to search: ");
                    int searchId = s.nextInt();
                    
                    Book foundBook = library.searchBook(searchId);
                    if (foundBook != null) {
                        System.out.print("Book found: " + foundBook);
                    } else {
                        System.out.print("Book not found.");
                    }
                    break;
                    
                case 4:
                    library.displayBooks();
                    break;
                    
                case 5:
                    System.out.print("Exiting program.");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.print("Please enter a number from 1 to 5.");
            }
            s.close();
        }
	}
}
