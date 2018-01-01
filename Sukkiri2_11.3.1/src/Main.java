
import java.io.IOException;
import java.net.*;
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("起動完了");
		
		/*
		 * 【接続を待ち受ける側】のプログラム
		 * PCからの通信を待ち受けるには、java.netパッケージの【ServerSocketクラス】を利用する
		 */
		
		/*
		 * ①「待ち受けポート番号」を指定して、ServerSocketインスタンスをnewする
		 */
		ServerSocket svSock = new ServerSocket(39648);
		
		Socket sock = svSock.accept();
		
		System.out.println(sock.getInetAddress() + "から接続");
		
		sock.getOutputStream().write("WELCOME".getBytes());
		sock.getOutputStream().flush();
		sock.close();
	}
}
