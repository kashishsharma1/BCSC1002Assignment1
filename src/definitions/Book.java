/*  Created by IntelliJ IDEA.
 *  User: Kashish Sharma(kashishsharma1)
 *  Date: 30/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Scanner;
import java.util.Objects;

public class Book {
    Scanner scan = new Scanner(System.in);
    private String bookName = scan.nextLine();
    private String authorName = scan.nextLine();
    private String isbnNumber = scan.nextLine();

    public Book() {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String toString() {
        return String.format(
                "Book Name: %s, ISBN Number: %s, Author Name: %s",
                getBookName(), getIsbnNumber(), getAuthorName()
        );
    }

    public boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (b == null || getClass() != b.getClass()) {
            return false;
        }
        Book book = (Book) b;
        return this.getAuthorName().equals(book.getAuthorName()) &&
                this.getIsbnNumber().equals(book.getIsbnNumber()) &&
                Objects.equals(this.getBookName(), book.getBookName());
    }

    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getIsbnNumber());
    }
}
