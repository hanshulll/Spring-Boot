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

    static final String DB_URL = "jdbc:postgresql://localhost:5432/demo";
    static final String USER = "hanshulchandel";
    static final String PASSWORD = "ServBay.dev";
    static final String CREATE_DATA_QUERY = "insert into student values(6, 'Alex', 69)";
    static final String READ_DATA_QUERY = "select * from student";
    static final String UPDATE_DATA_QUERY = "update student set sname='John' where sid=6";
    static final String DELETE_DATA_QUERY = "delete from student where sid=6";

    public static void main(String[] args) throws Exception {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            System.out.println("Connection Established");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(READ_DATA_QUERY);
            System.out.println("sid sname marks");
            while (rs.next()) {
                System.out.print(rs.getInt("sid") + " - ");
                System.out.print(rs.getString("sname") + " - ");
                System.out.println(rs.getInt("marks"));
            }
            System.out.println("Insert query executed : " + stmt.execute(CREATE_DATA_QUERY));
            System.out.println("Update query executed : " + stmt.execute(UPDATE_DATA_QUERY));
            System.out.println("Delete query executed : " + stmt.execute(DELETE_DATA_QUERY));
            executePreparedStatement(7, "Max", 88, con);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void executePreparedStatement(int sid, String sname, int marks, Connection con) throws SQLException {
        String query = "insert into student values (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, sid);
        stmt.setString(2, sname);
        stmt.setInt(3, marks);
        System.out.println("PreparedStatement executed : " + stmt.execute());
    }
}
