// Q304
package exceptions;
import java.sql.*;
public class Q304 {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "admin";
        String pass = "admin123";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception: Driver not found -> "+e.getMessage());
        }
        catch(SQLException e){
            System.out.println("Exception: Connection could not be established -> "+e.getMessage());
        }
    }
}
