import java.io.*;
import java.net.*;
public class MyServer03{
	public static void main(String[] args) {
		ServerSocket so = null;
		Socket sock;
		InputStream is;
		byte[] buff = new byte[1024];

		try {
			so = new ServerSocket(5999,30);
			sock = so.accept();
			is = sock.getInputStream();
			int n = is.read(buff);
			System.out.write(buff,0,n);
		} catch(Exception e) {

		}
	}
}