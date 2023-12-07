package se.lexicon;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Learn Java for Dummies", "John Smith"),
                new Book("Learn JavaScript in 10 Minutes", "Jack Arnold"),
                new Book("Learn IOS", "Edgar Alan Poe"),
                new Book("Learn SQL", "James Rodriguez"),
                new Book("Learning .Net is not boring", "Hungry Jack"),
                new Book("Shine while learning Ruby", "Britney Spears"),
                new Book("Move like a snake with Phython", "Snejk Olsson"),
                new Book("Learn PHP and work in Facebook", "Bill Gates"),
                new Book("Learn C only if you are smart", "Goofy"),
                new Book("Learn C++ in a year++", "Atreyu")
        };

        Person person1= new Person("christian","myren");
        Person person2= new Person("satya","bindu");
        System.out.println("person1 = " + person1.getFirstName());






    }
}