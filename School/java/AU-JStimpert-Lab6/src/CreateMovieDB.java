import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateMovieDB {

		public static void main(String[] args) throws Exception {
			final String DB_URL = "jdbc:derby:Databases/MovieDB;create=true";

			try {
				Connection conn = DriverManager.getConnection(DB_URL);
				Statement stmt = conn.createStatement();

				System.out.println("Creating the Movie table...");
				stmt.execute("CREATE TABLE Movie" + "( title CHAR(35), NOT NULL PRIMARY KEY, " + "screens INTEGER," + "numberOfShowings INTEGER, " + "ticketsSold INTEGER," + "receiptTotal DOUBLE) )");

				stmt.close();
				conn.close();
				System.out.println("Done");
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex.getMessage());
			}
		}
	}