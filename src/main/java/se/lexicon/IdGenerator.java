package se.lexicon;

public class IdGenerator {
    private static int counter = 0;
    public int generateId(){
        return ++counter;
    }
}
