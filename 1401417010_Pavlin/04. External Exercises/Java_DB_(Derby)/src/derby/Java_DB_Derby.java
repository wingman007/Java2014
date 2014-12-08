package derby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java_DB_Derby {

    public static void main(String[] args) {
        
        try {
            
            String host = "jdbc:derby://localhost:1527/Derby";
            String db_login = "root";
            String db_password= "root";
            
            Connection con = DriverManager.getConnection(host, db_login, db_password);
            
            Statement stmt = con.createStatement();
            
            String SQL = "SELECT * FROM DATABASE";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                
                String username = rs.getString("username");
                
                String password = rs.getString("password");
                
                String email = rs.getString("email");
                
                System.out.println("ID " + id + ", username " + username + ", password " + password + ", email " + email);
                
            }
        }
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
