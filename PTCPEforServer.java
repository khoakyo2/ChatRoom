package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PTCPEforServer {
	public final static int defaultPort = 7; // Cong mac dinh
	public final static String defaultName = "localhost";

	public static void main(String[] args) {
		try {
			ServerSocket listen = new ServerSocket(defaultPort); // Tao socket cho server
			while (true) {
				try {
					Socket s = listen.accept(); // Lang nghe cac yeu cau noi ket
					RequestProcessing rp = new RequestProcessing(s); // Tao phan xu ly
					rp.start(); // khoi dong phan xu ly cho client hien tai
				} catch (IOException e) {
					System.out.println("Connection Error: " + e);
				}
			}
		} catch (IOException e) {
			System.err.println("Create Socket Error: " + e);
		}
	}
}