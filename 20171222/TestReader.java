import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);

			String data = br.readLine();
			System.out.println("data:"+data);
		}catch(IOException e){
			System.out.println("失敗");
		}		
	}
}