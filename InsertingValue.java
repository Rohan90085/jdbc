import java.sql.*;

import static java.lang.Class.forName;

public class InsertingValue {

    public static void main(String args[]) {
        String user = "rohanph";
        String p = "Rohanph@900";
        String url = "jdbc:mysql://Localhost:3306/jdbc";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            Connection con = DriverManager.getConnection(url, user, p);
            Statement st = con.createStatement();
            String query = String.format("insert into user (id,name)values(%d,'%s')", 5, "rohanph");
            int r = st.executeUpdate(query);
            System.out.println(r);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
