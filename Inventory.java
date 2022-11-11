package CMIS242;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    ArrayList<Book> list;  //attribute to store a list of Book objects

    public Inventory() {

        list = new ArrayList<Book>();  //creates new instance of an empty list
    }

    public void add() {  //method to add a Book to a list
        Scanner scan = new Scanner(System.in);

        //prompt user for all book data
        System.out.println("Book Information");  //label for the program

        System.out.println("Enter the book's ID: "); // Book Id
        int id = scan.nextInt();

        System.out.println("Enter book's title: ");  // Book Title
        String title = scan.next();

        System.out.println("Enter book's price: ");  // Book price
        double price = scan.nextDouble();

        Book newBook = new Book(id, title, price);  // constructor
        list.add(newBook);

        System.out.println("Book has been successfully added." + newBook);  //DISPLAYS A LOCATION IN HEAP INSTEAD OF BOOK DATA. WHY??
    }

    public void remove() {  //method to remove book from list
        Scanner scan = new Scanner(System.in);

        //prompt user for the data to find the book to remove
        System.out.print("What is the book id of the book you want to remove? ");
        int id = scan.nextInt();

        //look for the book that matches above
        int size = list.size();  // number of books in the list
        System.out.println();
        for (int i = 0; i < size; i++) {  //loop for all books in the list
            Book choice = list.get(i);

            if (choice.id == id) {  //if statement to remove a book
                list.remove(i);
                System.out.println("\nRemoved the following book: " + choice.toString());  //print statement stating book has been removed

                return;
            }
        }
        System.out.println("\nThere is no book with this id");  //display statement of no book found
    }

    public void find() {  //method to find a book in the list
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the book id you want to find? ");  //user input
        int id = scan.nextInt();

        // look for the book that matches the id
        int size = list.size();
        System.out.println();  //empty line before data
        for (int i = 0; i < size; i++) {  //loop for all books in the list
            Book choice = list.get(i);  // get book instance from the list for each index

            if (choice.id == id) {
                list.set(i, choice);
                System.out.println(choice.toString());
                return;
            }
        }
        System.out.println("\nThere is no book with this id");   //display statement of no book found
    }

    public void display() {  // method to display all the book data
        if (list.size() == 0)
            System.out.println("\nThere are no books to display");
        else {
            System.out.println(); //empty line before book data
            for (int i = 0; i < list.size(); i++) {
                Book c = list.get(i);

                System.out.println(c.toString());
            }
        }
    }
}
