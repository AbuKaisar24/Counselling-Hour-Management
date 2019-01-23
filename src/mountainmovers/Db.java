
package mountainmovers;
import java.sql.*;
import javax.swing.JOptionPane;

public class Db {
    Connection conn=null;
    public static Connection javadb()
    {
       try
        {
            Class.forName("org.sqlite.JDBC");
           
            Connection conn  = DriverManager.getConnection("jdbc:sqlite:database1.sqlite");
            return conn;
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
          return null;
        }
}
}
