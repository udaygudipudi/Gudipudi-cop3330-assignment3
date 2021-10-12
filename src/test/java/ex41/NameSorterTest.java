package ex41;

import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    public static void sortnames() throws IOException {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");

        NameSorter.sortnames(names);

        assertEquals("Johnson, Jim", names.get(0));
        assertEquals("Jones, Aaron", names.get(1));
        assertEquals("Jones, Chris", names.get(2));
        assertEquals("Ling, Mai", names.get(3));
        assertEquals("Swift, Geoffrey", names.get(4));
        assertEquals("Xiong, Fong", names.get(5));
        assertEquals("Zarnecki, Sabrina", names.get(6));

    }

}