package family.remindme.registration;
// Might need to come back to this class later and make it look better

import org.springframework.context.annotation.Bean;

public class User 
{
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public User()
    {
        // No fields because the user is prompted for the fields
    }

    public boolean setFirstName(String firstName)
    {
        this.firstName = firstName;
        return true;
    }

    @Bean
    public String getFirstName()
    {
        return this.firstName;
    }

    public boolean setLastName(String lastName)
    {
        this.lastName = lastName;
        return true;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public boolean setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return true;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
}
