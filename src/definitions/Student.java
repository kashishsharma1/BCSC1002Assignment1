/*  Created by IntelliJ IDEA.
 *  User: Kashish Sharma (kashishsharma1)
 *  Date: 30/08/20
 *  Time: 5:33 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Scanner;
import java.util.Objects;
import java.lang.String;

public class Student {
    Scanner scan = new Scanner(System.in);
    private String firstName;
    {
        scan.nextLine();
    }

    private String middleName;
    {
        scan.nextLine();
    }

    private String lastName;
    {
        scan.nextLine();
    }
    private long universityRoll = scan.nextLong();
    private int numberOfBookIssued = scan.nextInt();
    private String[] booksIssued;

    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRoll() {
        return universityRoll;
    }

    public void setUniversityRoll(long universityRoll) {
        this.universityRoll = universityRoll;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public String[] getIssuedBooks() {
        return booksIssued;
    }

    public void setIssuedBooks(String[] booksIssued){
        booksIssued = new String[this.numberOfBookIssued];
        for(int index = 0; index < this.numberOfBookIssued; index++ ){
            booksIssued[index] = scan.nextLine();
        }

    }

    public String toString() {
        return String.format(
                "First Name: %s, Last Name: %s, University RollNumber: %d",
                getFirstName(), getLastName(), getUniversityRoll()
        );
    }

    public boolean equals(Object s) {
        if (this == s) {
            return true;
        }
        if (s == null || getClass() != s.getClass()) {
            return false;
        }
        Student student = (Student) s;
        return this.getFirstName().equals(student.getFirstName()) &&
                this.getUniversityRoll() == student.getUniversityRoll() &&
                Objects.equals(this.getLastName(), student.getLastName());
    }

    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getUniversityRoll());
    }
}
