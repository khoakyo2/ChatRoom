package Server;

import java.sql.Connection;
import java.sql.Statement;

/**************************************************************************
* Source File	:  History.java
* Author                   :  ss  
* Project name         :  Non enregistré* Created                 :  15/09/2020
* Modified   	:  16/09/2020
* Description	:  Definition of the class History
**************************************************************************/


public class History {
	// Inners Classifiers

	// Attributes
	private String Username,Id_Room;
	private String Time; // time = yyyy-mm-dd 00:00:00
	private String Note;
	private String File_Name;

	// Attributes Association

	// Operations

	public History(String username,String id_room,String time,String note,String file_name) {
		
		this.Username=new String(username);
		this.Id_Room=new String(id_room);
		this.File_Name=new String(file_name);
		this.Note=new String(note);
		this.Time=new String(time);
		
	}

	public String getUsername() {
		return Username;
	}

	public String getId_Room() {
		return Id_Room;
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

	public static boolean createHistory(String username,String id_room,String time,String note, String file_name) {
		
		boolean f=false;
		try {
			Connection cn = AccessDB.getConnection();
			Statement st = cn.createStatement();
			st.executeUpdate("INSERT INTO history VALUES('"+username+"','"+id_room+"','"+time+"','"+note+"','"+file_name+"');");
			f=true;
		}catch(Exception e) {
			f=false;
			e.printStackTrace();
		}
		return f;
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

	public static boolean deHistory(String username,String id_room,String time) {
		
		boolean f;
		try {
			Connection cn = AccessDB.getConnection();
			Statement st = cn.createStatement();
			st.executeUpdate("DELETE FROM history WHERE USER_NAME='"+username+"' AND ID_ROOM='"+id_room+"' AND TIME='"+time+"';");
			f=true;
		}catch(Exception e) {
			f=false;
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deDataRoom(String id_room) {
		
		boolean f;
		try {
			Connection cn = AccessDB.getConnection();
			Statement st = cn.createStatement();
			st.executeUpdate("DELETE FROM history WHERE ID_ROOM='"+id_room+"';");
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
