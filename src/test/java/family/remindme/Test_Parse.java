
package family.remindme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

@SpringBootTest
public class Test_Parse
{
    
    @Test
    public void loadTwilml(){

        try {
            // currently, this test only handles opening a twilML file and 
            // not really testing any logic. What there are a few improvements 
            // to be made to the testing. First, the path should not be 
            // specifically to the home dir that every thing is in. Instead, it
            // should be in the test dir so that path needs to be in the test.
            // Second, there will need to be multiple test files covering all
            // parse issues. 

            InputStream inputStream = getClass().getResourceAsStream("/test.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbf.newDocumentBuilder();
            Document doc = dBuilder.parse(inputStream);

            doc.getDocumentElement().normalize();

            NodeList messages = doc.getElementsByTagName("Body");
            if (messages.getLength() > 0) {
                Element msg = (Element) messages.item(0);
                String strMessage = msg.getTextContent();
                System.out.println("Parsed message:\n\t" + msg.getTextContent());
                System.out.println("Attempt to print msg as a string:\n\t" + strMessage.toLowerCase());
                
                assert strMessage.toLowerCase().equals("list");
            } 
        } catch (Exception e) {
            assert false;
        }

    }


    @Test
    void tenthTest()
    {
        assert true;
    }
}
