package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
       public static Connection getDBConnection(){
           try {
               Class.forName("com.mysql.jdbc.Driver");
               return DriverManager.getConnection("jdbc:mysql://localhost:3307/trainBookingSystem", "root", "97821");
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return null;
       }

}
