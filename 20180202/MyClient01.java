import java.io.*;
import java.net.*;
public class MyClient01{
	public static void main(String[] args) {
		Socket sock = null;
		try{
			sock = new Socket("172.16.21.47",6000);
		}catch(Exception e){

		}
	}
}