import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
    public static Connection ConnerDB(){
     try{ 
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String ConnectionUrl="jdbc:sqlserver://localhost:1433;databaseName=libaryMSS;"
                 + "user=su;password=56646435;";
         Connection conn=DriverManager.getConnection(ConnectionUrl);
         return conn;
     }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
     }
    }
    
}
