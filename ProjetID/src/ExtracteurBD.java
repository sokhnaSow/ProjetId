import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class ExtracteurBD {
	
	private Connection cnx;
	
	public void connexion() throws SQLException, ClassNotFoundException{
		try{
			Class.forName("org.mysql.Driver");
			System.out.println("Driver O.K");
			
			String url = "jdbc.mysql://localhost/univ_bd_3";
			String user = "mysql";
			String password = "nadia";
			
			cnx = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("Connexion r�ussie");
			
			//On cr�e un objet Statement
			Statement state = (Statement) cnx.createStatement();
			
			//On cr�e un objet ResultSet qui contient le r�sultat de la requ�te SQL
			ResultSet result = state.executeQuery("SELECT * FROM univ_bd_3");
			
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}