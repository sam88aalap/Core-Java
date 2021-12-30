import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
	public static void main(String[] args) {
		Connection connection;
		try {
			// 1.loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. establishing connection
			//Connection URL, username, password
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","thanos");
			System.out.println("Connected");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
