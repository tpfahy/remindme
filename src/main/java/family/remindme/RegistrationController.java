package family.remindme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute Registration user, Model model) {
        model.addAttribute("message", 
            "Thank you, " + user.getFirstName() + " " + user.getLastName() + 
            ". Your phone number " + user.getPhoneNumber() + " has been registered.");
        return "result";
    }
}
