/*  Created by IntelliJ IDEA.
 *  User: Kashish Sharma(kashishsharma1)
 *  Date: 30/08/20
 *  Time: 9:20 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.lang.String;


public class Library {
    private Book[] shelf;
    public Library() {
        this.shelf = new Book[10];
        for (int i = 0; i < shelf.length; i++) {
            shelf[i] = new Book();
        }
    }

    public Book[] getAvailableBooks() {
        return shelf.clone();
    }

    public void setAvailableBooks(Book[] shelf) {
        this.shelf = shelf;
    }

    public boolean equals(Object l) {
        if (this == l) {
            return true;
        }
        if (l == null || getClass() != l.getClass()) {
            return false;
        }
        Library that = (Library) l;
        return Arrays.equals(getAvailableBooks(), that.getAvailableBooks());
    }

    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }

    public String toString() {
        return Arrays.toString(shelf);
    }

    public void issueBook(String name) {
        System.out.println(name + " was added to the issued books.");
    }

    public void doReturn(String name) {
        System.out.println("Thank you for returning, " + name + ". Hope you liked it!");
    }

    public void displayAvailableBooks() {
        for (Book book: shelf) {
            System.out.println(book);
        }
    }
}
