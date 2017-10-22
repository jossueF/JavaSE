package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDeDatos {

	public static void main(String[] args) throws SQLException{
		
		final String JDBC_DRIVER = "org.postgresql.Driver";
		final String DB_URL = "jdbc:postgresql://localhost:5432/personas";
		final String USUARIO = "postgres";
		final String PASSWORD = "admin";
		
		try(Connection conexion = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD)){
			Class.forName(JDBC_DRIVER);
	
			PreparedStatement st = conexion.prepareStatement("insert into persona values(3, 'Charmin', 28)");
			st.executeUpdate();
			System.out.println("Query ejecutado");
			st.close();
			
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
