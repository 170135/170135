import java.io.*;
   import java.net.*;
   import java.util.*;
   
   class Netclock{
   	public static void main(String[] args){
   		ServerSocket servsock = null;
   		Socket sock;
   		OutputStream out;
   		String outstr;
   		int i;
   		Date d;
   
   		try{
   			servsock = new ServerSocket(6000, 200);
   			System.out.println("サーバー建てたよ！");
   			while(true){
   				sock = servsock.accept();
   				d = new Date();
   				outstr = new java.util.Scanner(System.in).nextLine();
   				if(outstr.equals("Yamaguchi")){
   					System.out.println("バイバイ");
   					sock.close();
   				}else{
   					System.out.println(outstr);
   				}
   				out = sock.getOutputStream();
   				for(i = 0; i < outstr.length(); i++)
   					out.write((int)outstr.charAt(i));
   					out.write('\n');
   
   					sock.close();
   			}
   		}catch (IOException e){
   			System.exit(1);
   		}
   	}
   }