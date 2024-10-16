import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            var factory = SAXParserFactory.newInstance();
            var parser = factory.newSAXParser();
            var handler = new SaxHandler();
            parser.parse(new FileInputStream("src/_03_xml/_03_sax/sax_cats.xml"), handler);
            var cats = handler.getCats();
            cats.forEach(System.out::println);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
