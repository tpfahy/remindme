
package family.remindme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

@SpringBootTest
public class Test_Parse
{
    
    @Test
    public void loadFile(){

        try
        {
            // currently, this test only handles opening a twilML file and 
            // not really testing any logic. What there are a few improvements 
            // to be made to the testing. First, the path should not be 
            // specifically to the home dir that every thing is in. Instead, it
            // should be in the test dir so that path needs to be in the test.
            // Second, there will need to be multiple test files covering all
            // parse issues. 
            File twilFile = new File("test.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbf.newDocumentBuilder();
            Document doc = dBuilder.parse(twilFile);

            doc.getDocumentElement().normalize();

            NodeList messages = doc.getElementsByTagName("Message");
            if (messages.getLength() > 0) {
                Element msg = (Element) messages.item(0);
                System.out.println("Parsed message: \n\t" + msg.getTextContent());
            } else {
                System.out.println("No <Message> element found.");
            }
            // need to check for an actual value
            assert true;
        } catch (Exception e)
        {
            e.printStackTrace();
            assert false;
        }

    }
}
