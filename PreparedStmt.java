import java.sql.*;
import java.util.Scanner;
public class PreparedStmt {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String pw="Rohanph@900";
        String user="rohanph";
        String url="jdbc:mysql://Localhost:3306/jdbc";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        try{
            Connection con=DriverManager.getConnection(url,user,pw);
            PreparedStatement ps=con.prepareStatement("insert into user values(?,?)");
            System.out.println("enter rool>");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("name>>");
            String name=sc.nextLine();
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.executeUpdate();
           // System.out.println("excuteds");
            PreparedStatement s=con.prepareStatement("select * from user");
            ResultSet rs=s.executeQuery();
            while(rs.next()){
                System.out.println("id:"+rs.getInt(1)+"name:"+rs.getString(2));
            }

        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
