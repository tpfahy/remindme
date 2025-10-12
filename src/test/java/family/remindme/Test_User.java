package family.remindme;

import family.remindme.registration.User;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test_User {

    User superUser = new User();

    @Test
    void createUser()
    {
        User user = new User();
        assertTrue(user != null);
    }

    @Test
    void setFirstName()
    {
        assertTrue(superUser.setFirstName("John"));
    }

    @Test
    void setLastName()
    {
        assertTrue(superUser.setLastName("Doe"));
    }

    @Test
    void setPhoneNumber()
    {
        assertTrue(superUser.setPhoneNumber("8042796161"));
    }

    @Test
    void getFirstName()
    {
        assertTrue(superUser.getFirstName().equals("John"));
    }

    @Test
    void getLastName()
    {
        assertTrue(superUser.getLastName().equals("Doe"));
    }

    @Test
    void getPhoneNumber()
    {
        assertTrue(superUser.getPhoneNumber().equals("8042796161"));
    }
}
