
package family.remindme.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Database 
{
    @Value("$database.url")
    private String conString;
    private String connectionTime;
    public Database()
    {
        // maybe put something here maybe not idk
        this.connectionTime = "someTime";
    }

    public Connection connect() throws SQLException
    {
        System.out.println("Connecting to database . . .\n");
        return DriverManager.getConnection(conString);
    }

    public String getConnectionTime()
    {
        return this.connectionTime;
    }

    public String getConString() {
        return "Nice try";
    }

}