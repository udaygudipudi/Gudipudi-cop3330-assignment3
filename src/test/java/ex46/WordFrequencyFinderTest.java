package ex46;

import org.junit.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {

    @Test
    public static void wordorder(){

        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> wordorder = new ArrayList<String>();

        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("snake");
        words.add("mushroom");
        words.add("badger");

        WordFrequencyFinder.wordcount(words, wordorder);

        assertEquals("snake", wordorder.get(0));
        assertEquals("mushroom", wordorder.get(1));
        assertEquals("badger", wordorder.get(2));

    }

}