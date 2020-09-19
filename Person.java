
/**************************************************************************
* Source File	:  Person.java
* Author                   :  ss  
* Project name         :  Non enregistré* Created                 :  15/09/2020
* Modified   	:  16/09/2020
* Description	:  Definition of the class Person
**************************************************************************/
package Server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
	// Inners Classifiers

	// Attributes
	private String User_Name;
	private String Password;
	

	// Attributes Association

	History User_Room[];

	Hischat Make_Friend[]; //load from client

	// Operations

	public Person(String us, String pw) {

		this.User_Name = new String(us);
		this.Password = new String(pw);

	}

	public String getUsername() {

		return this.User_Name;
	}

	public String getPassword() {

		return this.Password;
	}
	
	

	public void setPassword(String newpass) throws SQLException {

		this.Password = newpass;
		Connection cn = AccessDB.getConnection();
		Statement st = cn.createStatement();
		st.executeUpdate("UPDATE person SET PASSWORD = '" + newpass + "' WHERE USER_NAME='" + this.User_Name + "';");

	}

	public static boolean login(String us, String pw) throws SQLException {

		boolean f = false;
		Connection cn = AccessDB.getConnection();
		Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("SELECT DISTINCT USER_NAME,PASSWORD FROM person WHERE USER_NAME='" + us
				+ "' AND PASSWORD='" + pw + "';");
		try {
			rs.absolute(1);
			if (rs.getString(1).equals(us) && rs.getString(2).equals(pw))
				f = true;
		} catch (Exception e) {
			f = false;
		}
		return f;

	}
	
	public static boolean createAccount(String us, String ps) {
		
		boolean f=false;
		try {
			Connection cn = AccessDB.getConnection();
			Statement st = cn.createStatement();
			ResultSet rs=st.executeQuery("SELECT DISTINCT USER_NAME FROM person WHERE USER_NAME='" + us + "';");
			try {
				f=rs.absolute(1);
			}catch(Exception e) {
				
			}
			if (f) st.executeUpdate("INSERT INTO person VALUES('"+us+"','"+ps+"');");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void logout() {
	}
	
	public static Person findUser(String username) throws SQLException {
		
		Connection cn=AccessDB.getConnection();
		Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("SELECT * FROM person WHERE USER_NAME='" + username + "';");
		Person resuilt=null;
		try {
			rs.absolute(1);
			resuilt=new Person(rs.getString(1),rs.getString(2));
		}catch(Exception e) {
			return null;
		}
		return resuilt;
	}

} // End Class Person
