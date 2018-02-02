public class MyServer{
	public static void main(String[] args) {
		int num = args.length;
		System.out.println("コマンドラインの個数: "+num);

		for (int i = 0; i<num; i++) {
			System.out.println("args["+i+"]"+args[i]);
		}
	}
}