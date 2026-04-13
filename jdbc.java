

import java.sql.ResultSet;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

class Main{
   public static void main(String args[]) throws Exception {
       String query = "select * from user";
       String url = "jdbc:mysql://Localhost:3306/jdbc";
       String user = "rohanph";
       String password = "Rohanph@900";
       try
       {

           Connection cn = DriverManager.getConnection(url, user, password);
           Statement st = cn.createStatement();
           ResultSet R = st.executeQuery(query);
           while (R.next()) {
               String columnLabel;
               int id = R.getInt(1);
               String name = R.getString(2);
               System.out.println(id);
               System.out.println(name);
           }
       }
       catch(SQLException e){
           System.out.println(e.getMessage());
       }
   }
}