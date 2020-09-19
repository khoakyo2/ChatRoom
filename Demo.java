package Server;

import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws SQLException {
		boolean f=History.deDataRoom("r0001");
		System.out.print(f);
	}

}
