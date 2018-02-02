import java.net.*;
import java.io.*;
public class MyClient03{
	public static void main(String[] args) {
		Socket sock;
		OutputStream os;
		InputStream is;
		byte[] buff = new byte[1024];
		try {
			sock = new Socket("172.16.21.47",5000);
			is = sock.getInputStream();
			int n = is.read(buff);
			System.out.write(buff, 0, n);
			os = sock.getOutputStream();
			os.write(buff);
		} catch(Exception e) {

		}
	}
}