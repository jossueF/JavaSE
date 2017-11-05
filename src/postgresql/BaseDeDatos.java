package postgresql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BaseDeDatos {

	private final static String JDBC_DRIVER = "org.postgresql.Driver";
	private final static String DB_URL = "jdbc:postgresql://localhost:5432/personas";
	private final static String USUARIO = "postgres";
	private final static String PASSWORD = "admin";
	
	public static void main(String[] args) throws SQLException{
		Calendar calendar = new GregorianCalendar();
		Date date = new Date(calendar.getTime().getTime());
		
		conexion(1, "Jossue", 28, date);
	}
	
	public static void conexion(int id, String nombre, int edad, Date creado){
		try(Connection conexion = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD)){
			Class.forName(JDBC_DRIVER);
	
			PreparedStatement st = conexion.prepareStatement("insert into persona values(?,?,?,?)");
			st.setInt(1, id);
			st.setString(2, nombre);
			st.setInt(3, edad);
			st.setDate(4, creado);
			
			st.executeUpdate();
			System.out.println("Query ejecutado");
			st.close();
			
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
