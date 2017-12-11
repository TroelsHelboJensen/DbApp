import java.sql.*;

public class SqlConnector
{
    private Connection connection;
    private ResultSet rs;
    private Statement stmt;

    public SqlConnector() {
        // https://docs.microsoft.com/en-us/sql/connect/jdbc/connection-url-sample
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost;databaseName=Danish_Bank;user=app;password=1234;");
        }
        catch (SQLException eSQL)
        {
            eSQL.printStackTrace();
        }
        catch (ClassNotFoundException eCNF)
        {
            eCNF.printStackTrace();
        }
    }

    public void getCustomerForLogin() {
        try
        {
            // Execute query
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Customers");

            while (rs.next()){
                int id = rs.getInt("ID");
                System.out.println(id);
            }
        } catch (SQLException eSQL) {
            eSQL.printStackTrace();
            System.out.println("hej");
        }
    }
}