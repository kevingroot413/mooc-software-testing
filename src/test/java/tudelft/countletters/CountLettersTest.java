package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWordsWithS() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsWithR() {
        int words = new CountLetters().count("car|door");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void wordsDoNotMatch() {
        int words = new CountLetters().count("bike|airplane");
        Assertions.assertEquals(0, words);
    }

}