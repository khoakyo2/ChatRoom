package Server;

import java.sql.Connection;
import java.sql.Statement;

/**************************************************************************
* Source File	:  Hischat.java
* Author                   :  ss  
* Project name         :  Non enregistré* Created                 :  15/09/2020
* Modified   	:  16/09/2020
* Description	:  Definition of the class Hischat
**************************************************************************/


public class Hischat {
	// Inners Classifiers

	// Attributes
	private String Username,Id_Friend;
	private String Time; // time = yyyy-mm-dd 00:00:00
	private String Note;
	private String File_Name;

	// Attributes Association

	// Operations

	public Hischat(String username,String id_friend,String time,String note,String file_name) {
		
		this.Username=new String(username);
		this.Id_Friend=new String(id_friend);
		this.File_Name=new String(file_name);
		this.Note=new String(note);
		this.Time=new String(time);
		
	}

	public String getUsername() {
		return Username;
	}

	public String getId_Friend() {
		return Id_Friend;
	}

	public String getTime() {
		return this.Time;
	}

	public String getNote() {
		return this.Note;
	}

	public String getFileName() {
		return this.File_Name;
	}

	public static boolean createHischat(String username,String id_friend,String time,String note, String file_name) {
		
		boolean f=false;
		try {
			Connection cn = AccessDB.getConnection();
			Statement st = cn.createStatement();
			st.executeUpdate("INSERT INTO hischat VALUES('"+username+"','"+id_friend+"','"+time+"','"+note+"','"+file_name+"');");
			f=true;
		}catch(Exception e) {
			f=false;
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deHischat(String username,String id_friend,String time) {
		
		boolean f;
		try {
			Connection cn = AccessDB.getConnection();
			Statement st = cn.createStatement();
			st.executeUpdate("DELETE FROM hischat WHERE USER_NAME='"+username+"' AND ID_FRIEND='"+id_friend+"' AND TIME='"+time+"';");
			f=true;
		}catch(Exception e) {
			f=false;
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean deDataFriend(String id_friend) {
		
		boolean f;
		try {
			Connection cn = AccessDB.getConnection();
			Statement st = cn.createStatement();
			st.executeUpdate("DELETE FROM hischat WHERE ID_FRIEND='"+id_friend+"';");
			f=true;
		}catch(Exception e) {
			f=false;
			e.printStackTrace();
		}
		return f;
	}

} // End Class History

