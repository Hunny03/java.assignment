// Q303
package exceptions;
import java.sql.*;
public class Q303 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","secret");
            System.out.println("Connected");
        }
        catch(SQLException e){
            // mysql driver nahi hai isliye connection fail hoga
            System.out.println("Exception: Connection failed -> "+e.getMessage());
        }
    }
}
