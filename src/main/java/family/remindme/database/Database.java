
package family.remindme.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Database 
{
    @Value("$database.url")
    private String conString;

    public Database()
    {
        // maybe put something here maybe not idk
    }

    public String getConString() {
        return "Nice try";
    }

    public boolean connect()
    {
        try {
            System.out.println("Connecting to database . . .\n");
            DriverManager.getConnection(conString);
            System.out.println("Successful DB connection\n");
            return true;
        } catch (Exception e) {
            System.out.println("There was some error with the db class :/");
            return false;
        }
        
    }

}