package jdbc;
import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:postgresql://localhost:5432/c76_db"; // Your database
        String user = "postgres"; // Your username
        String password = "Rajmohan2005"; // Your password

        // JDBC variables
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL successfully!");

            // Create Statement
            stmt = conn.createStatement();

            // Execute Query to fetch all rows
            String query = "SELECT * FROM student";
            rs = stmt.executeQuery(query);

            // Process the result set
            System.out.println("Student Details:");
            System.out.println("--------------------------------------");
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                String city = rs.getString("city");

                System.out.println("ID: " + sid + ", Name: " + sname + ", City: " + city);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}