// Q305
package exceptions;
import java.sql.*;
public class Q305 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","admin","admin123");
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO staff VALUES (1,'Mohit')");
            st.executeUpdate("UPDATE staff SET name='Rohit' WHERE id=1");
            st.executeUpdate("DELETE FROM staff WHERE id=1");
            System.out.println("All queries executed successfully");
        }
        catch(SQLException e){
            System.out.println("Exception: SQL query failed -> "+e.getMessage());
        }
    }
}
