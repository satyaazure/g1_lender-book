package se.lexicon;

import java.util.Arrays;

public class Person {
    private static final IdGenerator generator = new IdGenerator();
    private final int personId;
    private String firstName;
    private String lastName;
    private Book book;
    private Book[] borrowedBooks= {};

    public Person (String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
        personId = generator.generateId();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void loanBook(Book book){
        if(book.isAvailable()){
            this.book = book;
            book.setBorrower(this);
            addToBorrowedBooks(book);
            System.out.println(firstName+" "+lastName+" borrowed the book: " + book.getTitle());
        }
        else {
            System.out.println("Book is not available: " + book.getTitle());
        }
    }

    private void addToBorrowedBooks(Book book) {
        if (borrowedBooks.length == 0) {
            borrowedBooks = Arrays.copyOf(borrowedBooks, 1);
            borrowedBooks[0] = book;
        } else {
            borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length);
            borrowedBooks[borrowedBooks.length - 1] = book;
        }
    }
}
