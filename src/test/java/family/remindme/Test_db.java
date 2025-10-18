package family.remindme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test_db {
    // this needs to be testing the db 
    // the plan here is to start a postgres container using
    // docker and then populate the db with pretend values
    // blah blah and test

    @Test
    void test_connection(){
        assert true;
    }

}
