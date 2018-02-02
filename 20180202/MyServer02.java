import java.io.*;
import java.net.*;
public class MyServer02{
	public static void main(String[] args) {
		ServerSocket so = null;
		Socket sock;
		try {
			so = new ServerSocket(6000,30);
			sock = so.accept();
			sock.getLocalSocketAddress();
			System.out.println(sock);
		} catch(Exception e) {

		}
	}
}