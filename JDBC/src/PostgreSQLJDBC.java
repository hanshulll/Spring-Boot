import java.sql.*;

public class PostgreSQLJDBC {
    /*
         import package
         load drivers
         register drivers
         create connection
         create statement
         execute statement
         close connection
     */

    public static void main(String[] args) throws Exception{
        Class ourClass = Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "hanshulchandel";
        String password = "password";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection Established");
    }

}
