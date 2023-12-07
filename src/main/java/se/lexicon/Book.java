package se.lexicon;

public class Book {
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        setAvailable(true);
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        if (isAvailable()){
            this.borrower = borrower;
            setAvailable(false);
        }
        else {
            System.out.println("book is not available");
        }
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
