import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOError;
import java.io.IOException;
import java.util.List;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException{
        Path filename = Path.of("test-file.md");
        String contents = Files.readString(filename);

        assertEquals(List.of("https://something.com", "some-thing.html")
        , MarkdownParse.getLinks(contents));

        filename = Path.of("test-file2.md");
        contents = Files.readString(filename);

        assertEquals(List.of("https://something.com", "some-page.html")
        , MarkdownParse.getLinks(contents));

        filename = Path.of("test-file3.md");
        contents = Files.readString(filename);

        assertEquals(List.of()
        , MarkdownParse.getLinks(contents));

        filename = Path.of("test-file4.md");
        contents = Files.readString(filename);

        assertEquals(List.of()
        , MarkdownParse.getLinks(contents));

        filename = Path.of("test-file5.md");
        contents = Files.readString(filename);

        assertEquals(List.of("page.com")
        , MarkdownParse.getLinks(contents));

        filename = Path.of("test-file6.md");
        contents = Files.readString(filename);

        assertEquals(List.of("page.com")
        , MarkdownParse.getLinks(contents));

//         filename = Path.of("test-file7.md");
//         contents = Files.readString(filename);

  //      assertEquals(new ArrayList<>()
    //    , MarkdownParse.getLinks(contents));

//         ArrayList <String> result = new ArrayList<String>();
//         assertEquals(result, MarkdownParse.getLinks(contents));

        filename = Path.of("test-file8.md");
        contents = Files.readString(filename);

        assertEquals(List.of("a link on the first line")
        , MarkdownParse.getLinks(contents));

        filename = Path.of("test-file-lab5.txt");
        contents = Files.readString(filename);

        assertEquals(List.of("https://something.com", "some-page.html", "link", "link2"), 
        MarkdownParse.getLinks(contents) );
    }
}
