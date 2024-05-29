import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MovieFileProcessor {

	public static void main(String[] args) {

		final String DB_URL = "jdbc:derby:Databases/MovieDB";

		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			Statement stmt = conn.createStatement();
			MovieScreening.CreateMovieScreeningsFromFile("input.txt");
			MovieScreening.updateMovieTotals(stmt);
			conn.close();
			
			
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

	


}
