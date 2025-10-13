
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
    private String conString;

    public Database(@Value("${database.url}") String conString)
    {
        this.conString = conString;
        
        try
        {
            DriverManager.getConnection(conString);
            System.out.println("Successful DB connection");
        } catch (Exception e) {
            System.out.printf("The connection string was %s", conString);
            e.printStackTrace();
        }
    }

    public String getConString() {
        return "Nice try :/";
    }

}