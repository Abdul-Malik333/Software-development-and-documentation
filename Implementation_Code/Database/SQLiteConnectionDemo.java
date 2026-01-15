import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Demonstrates a simple SQLite database connection using JDBC.
 * This code is provided for documentation purposes (Part 3).
 */
public class SQLiteConnectionDemo {

    /**
     * Creates a database connection and a sample table.
     * (Demo code - not required to run for submission.)
     */
    public static void createConnectionAndTable() {
        // SQLite database file name
        String url = "jdbc:sqlite:demo.db";

        String createTableSQL =
                "CREATE TABLE IF NOT EXISTS products (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL," +
                "price REAL NOT NULL" +
                ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.execute(createTableSQL);

        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
