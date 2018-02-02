import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class TestWriter{
	public static void main(String[] args) {
		try{
			while(true){
				System.out.println("1書き込み　2読み取り");
				int a = new Scanner(System.in).nextInt();
				if(a == 1){
					FileWriter fw = new FileWriter("data.txt",true);
					BufferedWriter bw = new BufferedWriter(fw);
					String msg = new Scanner(System.in).nextLine();
					bw.write(msg+"\r\n");
					bw.close();
					
				}else if(a == 2){
					FileReader fr = new FileReader("data.txt");
					BufferedReader br = new BufferedReader(fr);
					String data = br.readLine();
					if(data == null) break;
					System.out.println(data);
				}
			}

		}catch(IOException e){
			System.out.println("失敗");
		}
	}
}