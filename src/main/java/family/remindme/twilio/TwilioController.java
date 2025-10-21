
package family.remindme.twilio;

import family.remindme.parse.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class TwilioController
{
    @Value("$twilio.account-sid")
    private String twilAccountSID;

    @Value("$twilio.auth-token")
    private String twilAuthToken;

    @Value("$twilio.messaging-service-sid")
    private String twilMessagingSID;

    @Value("$twilio.phone-number")
    private String twilPhoneNumber;

    private final Parse parse;

    public TwilioController(Parse parse){
        this.parse = parse;
    }
    @PostMapping("/sms")
    public void receiveMessage(@RequestParam("From") String from, 
    @RequestParam("To") String to, @RequestParam("Body") String body){
        parse.parseBody(to, from, body);
    }



}
