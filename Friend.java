package Server;


/**************************************************************************
* Source File	:  Friend.java
* Author                   :  ss  
* Project name         :  Non enregistré* Created                 :  16/09/2020
* Modified   	:  16/09/2020
* Description	:  Definition of the class Friend
**************************************************************************/



public class Friend {
	// Inners Classifiers

	// Attributes

	private String ID_Friend;
	private String Since;

	// Attributes Association

	Hischat Make_Friend[];

	// Operations

	public Friend(String id,String since) {
		
		this.ID_Friend=new String(id);
		this.Since=new String(since); //since= yyyy-mm-dd 00:00:00
		
	}

	public String getID() {
		return this.ID_Friend;
	}

	public String getSince() {
		return this.Since;
	}

	public static void addFriend() {
	}

	public static void deFriend() {
	}

	public static void findFriend() {
	}

} // End Class Friend
