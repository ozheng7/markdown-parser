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
    }
}