
package family.remindme.parse;

import org.springframework.stereotype.Service;

import com.twilio.twiml.TwiML;
import java.io.File;

public class Parse {
    // this class will be the class that needs to parse the json from the api 
    // provided by twilio. This class should be able to parse the message 
    // to determine what the user wants and will call the db to execute that action

    private TwiML tml;

    public Parse(TwiML tml)
    {
        this.tml = tml;
    }

    public TwiML getTml()
    {
        return this.tml;
    }

    public String decodeTml()
    {
        return "todo";
    }
}