
package family.remindme.parse;

import org.springframework.stereotype.Service;

import com.twilio.twiml.TwiML;
import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


@Service
public class Parse<T> {
    // this class will be the class that needs to parse the json from the api 
    // provided by twilio. This class should be able to parse the message 
    // to determine what the user wants and will call the db to execute that action

    private T tml;

    public Parse(T tml)
    {
        this.tml = tml;
    }

    public String getMessage(T tml)
    {
        return null;
    }
    

public String getMessage(InputStream tml)
    {
            Element msg;

            try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbf.newDocumentBuilder();
            Document doc = dBuilder.parse(tml);

            doc.getDocumentElement().normalize();

            NodeList messages = doc.getElementsByTagName("Body");
            if (messages.getLength() > 0) {
                msg = (Element) messages.item(0);
                return msg.getTextContent().toLowerCase();

            }
                
            } catch (Exception e){
                return null;
                // pretty sure both of these aren't needed, probably just the last one, but
                // whatever, that's what learning is for
            }
            return null;
        }
    

    public String[] parseMessage(String msg)
    {
        return msg.split(",");
    }
}