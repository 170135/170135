import java.net.*;
import java.io.*;
public class MyClient02{
	public static void main(String[] args) {
		//ServerSocket so = null;
		OutputStream os;
		Socket sock;
		try {
			sock = new Socket("172.16.21.47",5999);
			sock.accept();
			os = sock.getOutputStream();
			os.write(sock);
		} catch(Exception e) {

		}
	}
}