package Permanencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

public class DatabaseManager {
	
	private static Connection databaseConnection;
	
	private static String Connection_String = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String usuario = "TGADMIN";
	private static String contrase�a = "TGADMIN";
	
	
	static{
		try {
			Locale.setDefault(new Locale("es","ES"));
			databaseConnection = DriverManager.getConnection(Connection_String, usuario, contrase�a);
			
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la Base de datos");
			System.out.println(e.getErrorCode());
		}
	}
	
	public static Connection getConnection(){
		return databaseConnection;
	}

}
