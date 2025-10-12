
package family.remindme.registration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user, Model model) {
        model.addAttribute("message", 
            "Thank you, " + user.getFirstName() + " " + user.getLastName()  
            + ". Your phone number has been registered with the database and "
            + "is pending approval.");
        return "result";
    }
}
