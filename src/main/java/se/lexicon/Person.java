package se.lexicon;

public class Person {
    private static int personId;
    private String firstName;
    private String lastName;
    private Book book;
    private String[] borrowedBooks= {};





    public Person (String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);

        IdGenerator generator = new IdGenerator();
        this.personId= generator.generateId();
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
        if(book.getBorrower()==null){
            this.book = book;
            book.setBorrower(this);
            System.out.println(firstName+" "+lastName+"Borrowed the book");
        }
        else {
            System.out.println(firstName+" "+lastName+"cannot borrow book");
        }
        if(borrowedBooks.)


    }
    public String displayBooks (){



    }
}
