import java.io.*;
import java.net.*;

public class Wrnet {
	public static void main(String[] args) {
		byte[] buff = new byte[1024];
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		boolean cont = true;

		//while(cont){
			try{
				sock = new Socket(args[0],Integer.parseInt(args[1]));
				is = sock.getInputStream();
				os = sock.getOutputStream();

				String msg = "ALOHA";
				buff = msg.getBytes();

				//int n = System.in.read(buff);

				if(buff[0] == '.')cont = false;
				else os.write(buff,0,buff.length);

				//n = is.read(buff);
				System.out.write(buff,0,buff.length);
				is.close();
			}catch(Exception e) {
				System.exit(1);
				//cont = false;
				System.out.println("ネットワークエラー");

			}
		//}	
	}
}