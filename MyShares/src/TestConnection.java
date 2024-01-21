import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.connections.MyConnection;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//	Class.forName("com.mysql.cj.jdbc.Driver");
		//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/citi", "root", "anaya@1995");
			
			MyConnection m = new MyConnection();
			
			System.out.println("connection");
		//	Statement st = con.createStatement();
			Statement st = m.getConnection().createStatement();
			int added = st.executeUpdate("insert into share(instrumentname,marketrate) values('Share123',300)");
			// if record is inserted...added = 1 else added = 0;
			if(added>0) {
				System.out.println("Rec inserted");
			}
			else {
				System.out.println("SORRY");
			}
		} 
	//	catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
