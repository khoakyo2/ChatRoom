package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.sql.SQLException;

public class RequestProcessing extends Thread {
	private Socket channel; // Socket cua kenh ao ket noi voi Client hien tai
	private BufferedReader is;
	private BufferedWriter os;
	
	public RequestProcessing(Socket s) {
		this.channel = s; // nhan socket cua kenh ao ket noi toi Client
	}
	
	public BufferedWriter process(BufferedReader is) throws IOException, SQLException {
		BufferedWriter resuilt= new BufferedWriter(new OutputStreamWriter(this.channel.getOutputStream()));
		
        while (true) {
            String line =is.readLine();
            switch (line) {
            case "login":{
            	String []values=new String[10];
            	int i=0;
            	do {
            		values[i]=is.readLine();
            		i++;
            	}while(values[i].equals("end"));
            	
            	if(Person.login(values[0], values[1]))
            		resuilt.write(1);
            	else resuilt.write(0);
            	return resuilt;
            }
            case "createAccount":{
            	break;
            }
            case "findUser":{
            	break;
            }
            }
        }
	}

	public void run() {
		try {
			 // Mo luong vao ra tren Socket tai Server.
	           this.is = new BufferedReader(new InputStreamReader(this.channel.getInputStream()));    
	           this.os=process(this.is); // Xu ly du lieu
	           this.os.flush();  // day du lieu di
		} catch (IOException | SQLException e) {
			System.err.println("Request Processing Error: " + e);
		}
	}
}