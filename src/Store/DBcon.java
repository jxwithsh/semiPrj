package Store;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {
	static Connection con;
	private DBcon() throws Exception {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="scott";
		String pass="199444";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con=DriverManager.getConnection(url, user, pass);
		System.out.println("����");
	}
	
	public static Connection getConnection() throws Exception {
		if (con==null) { //db�� ������ �ȵǾ��־�
			new DBcon();
		}
		return con;
	}

}
