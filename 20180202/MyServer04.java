import java.io.*;
import java.net.*;
public class MyServer04{
	public static void main(String[] args) {
		byte[] buff = new byte[1024];
		ServerSocket so = null;
		Socket sock;
		InputStream is; 
		OutputStream os;

		try{
			so = new ServerSocket(5000,20);
			sock = so.accept();

			String msg = "HELLO";
			buff = msg.getBytes();

			os = sock.getOutputStream();
			os.write(buff,0,buff.length);

			System.out.write(buff,0,buff.length);
		}catch(Exception e) {

		}
	}
}