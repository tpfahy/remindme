
package family.remindme;

import family.remindme.parse.*;

import java.io.File;
import java.io.InputStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Test_Parse
{
    
    @Test
    public void acceptPost()
    {

        // this needs to be like a post method

    }

            // currently, this test only handles opening a twilML file and 
            // not really testing any logic. What there are a few improvements 
            // to be made to the testing. First, the path should not be 
            // specifically to the home dir that every thing is in. Instead, it
            // should be in the test dir so that path needs to be in the test.
            // Second, there will need to be multiple test files covering all
            // parse issues. 




    @Test
    void tenthTest()
    {
        assert true;
    }
}
