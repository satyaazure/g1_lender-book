package se.lexicon;

public class Person {
    private static int personId;
    private String firstName;
    private String lastName;
    private Book book;

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
    public void  loanBook(Book book){

    }
}
