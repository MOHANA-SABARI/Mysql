import java.sql.*;

//import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        insertQuery();
        selectQuery();

    }

    static void insertQuery() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //System.out.println("Driver class Loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marks", "root", "M13");
        //System.out.println("Connected");
        Statement s = con.createStatement();
        //System.out.println("Statement Object Created");

        int n= s.executeUpdate("insert into look values('Work','Harish','Zogo',2003,23233);");

        //while(rs.next()){
            System.out.println("Value Inserted..!");
        //}


    }
    static void selectQuery() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class Loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marks", "root", "Moha12Villan13");
        System.out.println("Connected");
        Statement s = con.createStatement();
        System.out.println("Statement Object Created");

        ResultSet rs= s.executeQuery("select * from look WHERE topic='Zogo';");

        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }


    }
}
