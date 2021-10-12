package ex43;

import org.junit.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void checkwebsite(){

        String test;

       test = WebsiteGenerator.website("awesomeco","src/main/java/ex43/");

        assertEquals("./website/awesomeco", test);

    }

    @Test
    void checkhtml() throws IOException {

        String test;

        test = WebsiteGenerator.html("awesomeco", "me","src/main/java/ex43/");

        assertEquals("./website/awesomeco/index.html", test);

    }

    @Test
    void checkjava(){

        String test;

        test = WebsiteGenerator.java("awesomeco","src/main/java/ex43/");

        assertEquals("./website/awesomeco/js/", test);

    }

    @Test
    void checkcss(){

        String test;

        test = WebsiteGenerator.css("awesomeco","src/main/java/ex43/");

        assertEquals("./website/awesomeco/css/", test);

    }

}