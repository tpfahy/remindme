
package family.remindme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.Document;

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
            System.out.println("some thing:");
            System.out.println(doc.getDocumentElement().getNodeName());
            assert true;
        } catch (Exception e)
        {
            e.printStackTrace();
            assert false;
        }

    }
}
