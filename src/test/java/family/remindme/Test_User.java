package family.remindme;

import family.remindme.registration.User;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test_User {


    @Test
    void createUser()
    {
        User user = new User();
        assertTrue(user != null);
    }

    @Test
    void setFirstName()
    {
        User superUser = new User();
        assertTrue(superUser.setFirstName("John"));
    }

    @Test
    void setLastName()
    {
        User superUser = new User();
        assertTrue(superUser.setLastName("Doe"));
    }

    @Test
    void setPhoneNumber()
    {
        User superUser = new User();
        assertTrue(superUser.setPhoneNumber("8042796161"));
    }

    @Test
    void getFirstName()
    {
        User superUser = new User();
        superUser.setFirstName("John");
        assertTrue(superUser.getFirstName().equals("John"));
    }

    @Test
    void getLastName()
    {
        User superUser = new User();
        superUser.setLastName("Doe");
        assertTrue(superUser.getLastName().equals("Doe"));
    }

    @Test
    void getPhoneNumber()
    {
        User superUser = new User();
        superUser.setPhoneNumber("8042796161");
        assertTrue(superUser.getPhoneNumber().equals("8042796161"));
    }
}
