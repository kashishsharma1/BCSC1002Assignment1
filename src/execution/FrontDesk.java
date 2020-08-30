/*  Created by IntelliJ IDEA.
 *  User: Kashish Sharma(kashishsharma1)
 *  Date: 30/08/20
 *  Time: 9:42 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    private static Library[] Shelf;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Library[] shelf = new Library[0];
        do {
            System.out.println("-=-=--=-=-''Welcome to the Front Desk''-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me. ");
            System.out.println("2. Return a previously issued book for me. ");
            System.out.println("3. Show all my previously issued books. ");
            System.out.println("4. Exit ");
            System.out.println("... ");
            System.out.println("Enter your choice (1..4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case 1:
                    System.out.println("Enter the name of the book you want: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    shelf.issueBook(bookName);
                    break;
                case 2:
                    System.out.println("Enter the name of the book that you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    Shelf.doReturn(bookName);
                    break;
                case 3:
                    shelf.displayAvailableBooks();
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
    
}

