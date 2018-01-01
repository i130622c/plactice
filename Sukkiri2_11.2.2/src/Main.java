import java.io.*;
import java.net.*;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * サーバーとPC間の通信を行うには、プロトコル【TCP/IP】を用いる。
		 * 
		 * 【接続を行う側】のプログラム TCP/IPを使って接続を行うには、java.netパッケージの【Socketクラス】を用いる。
		 */

		/*
		 * ①「IPアドレス / サーバー名」と「ポート番号」を指定して、Socketインスタンスをnewする
		 */
		Socket sock = new Socket("dokojava.jp", 80);

		/*
		 * ②Socketから入力ストリーム（PC→サーバー）を取得する
		 */
		InputStream is = sock.getInputStream();

		/*
		 * ③Socketから出力ストリーム（サーバー→PC）を取得する
		 */
		OutputStream os = sock.getOutputStream();

		/*
		 * プロトコル ポート 用途 ********** ****** ****************** HTTP TCP 80
		 * Webページの取得 SMTP TCP 25 メールの送信 FTP TCP20/21 ファイルの伝送 SSH TCP 22 リモートログイン
		 * 
		 * 〈仕様例〉 "GET ファイル名 HTTP/1.0(改行)".getBytes() "(改行)".getBytes()
		 */
		os.write("GET /index.html HTTP/1.0\r\n".getBytes());
		os.write("\r\n".getBytes());
		os.flush();

		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1) {
			System.out.println((char) i);
			i = isr.read();
		}

		/*
		 * ④Socketを閉じる（このとき、InputStream と OutputStream は自動的にcloseされる）
		 */
		sock.close();

	}
}
