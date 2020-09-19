package Server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**************************************************************************
 * Source File : Room.java Author : ss Project name : Non enregistré* Created :
 * 15/09/2020 Modified : 16/09/2020 Description : Definition of the class Room
 **************************************************************************/

public class Room {
	// Inners Classifiers

	// Attributes

	private String ID_Room; // r0000,r0001,....,rXXXX
	private int Member;
	private String Room_Name;
	private String Room_Master;

	// Attributes Association

	History User_Room[];

	// Operations

	public Room(String id, int n, String name, String master) {

		this.ID_Room = id;
		this.Member = n;
		this.Room_Name = name;
		this.Room_Master = master;

	}

	public int getMember() {

		return this.Member;
	}

	public String getName() {

		return this.Room_Name;
	}

	public String getMaster() {

		return this.Room_Master;
	}

	public void setName(String name) throws SQLException {

		this.Room_Name = name;
		Connection cn = AccessDB.getConnection();
		Statement st = cn.createStatement();
		st.executeUpdate("UPDATE room SET ROOM_NAME = '" + name + "' WHERE ID_ROOM='" + this.ID_Room + "';");

	}
	
	public void setMember(int m) throws SQLException {

		this.Member = m;
		Connection cn = AccessDB.getConnection();
		Statement st = cn.createStatement();
		st.executeUpdate("UPDATE room SET MEMBER = '" + m + "' WHERE ID_ROOM='" + this.ID_Room + "';");

	}

	public static Room findRoom(String id) throws SQLException {
		
		Connection cn=AccessDB.getConnection();
		Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("SELECT * FROM room WHERE ID_ROOM='" + id + "';");
		Room resuilt=null;
		try {
			rs.absolute(1);
			resuilt=new Room(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
		}catch(Exception e) {
			return null;
		}
		return resuilt;
	}

	public static void createRoom(String name, int n, String master) throws SQLException {
		
		Random rd=new Random();
		boolean f;
		String id=new String();
		Connection cn = AccessDB.getConnection();
		Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		do {
			int i=rd.nextInt(999);
			id="r"+i;
			ResultSet rs=st.executeQuery("SELECT DISTINCT ID_ROOM FROM room WHERE ID_ROOM='" + id + "';");
			try {
				f=rs.absolute(1);
			}catch(Exception e) {
				f=false;
			}
		}while(f);
		st.executeUpdate("INSERT INTO room VALUES('"+id+"',"+n+",'"+name+"','"+master+"');");

	}

	public static boolean addMember(String username,String id_room) throws SQLException { //chua xong
		
		boolean f=false;
		Room r=Room.findRoom(id_room);
		Person p=Person.findUser(username);
		if (r!=null && p!=null) {
			f=true;
			r.setMember(r.getMember()+1);
			
		}
		return f;
	}

	public static void deMember() {
	}

	public static void moveMaster(String username) {
		
		
		
	}

} // End Class Room
