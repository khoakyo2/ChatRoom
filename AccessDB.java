package Server;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccessDB {
	
	private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/chatroom";
    private static String USER_NAME = "luan";
    private static String PASSWORD = "1234";
 
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

}
