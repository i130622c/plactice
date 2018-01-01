import java.io.*;

import javax.crypto.Cipher;
public class Main {

	/*
	 * 【3つのエラーの種類】
	 * ①Syntax Error(文法エラー) -> コンパイラが指摘したコードの箇所を修正すればよい。
	 * ②Runtime Error（実行時エラー） -> 「予めエラーが発生した時の対応策」を記述しておく必要がある （= 例外処理）
	 * ③Logic Error（論理エラー） -> 原因箇所を自力で探し出して修正。
	 * 
	 * 【3つの例外クラス】
	 * ①Error系例外: try-catch でキャッチする必要は「ない」。
	 * ②Exception系例外: try-catch でキャッチ「必須」。キャッチしないとコンパイルエラー。
	 * ③RuntimeException: try-catch でキャッチするかは「任意」。
	 */
	public static void main(String[] args)  {
		
		/*
		 * ******************************
		 * *テキストファイルへの書き込み*
		 * ******************************
		 */
		
		/*【ファイルを開く】
		 * 1) FileWriter(String fileName, boolean append) throws IOException (ファイルの新規作成 or 書き込みリセット)
		 * 2) FileWriter(String fileName) throws IOException (true: 上書き, false: 書き込みリセット/ファイルの新規作成)
		 * 
		 * -fileName: システムに存在するファイルへのパス
		 * -append: trueの場合、バイトが「ファイルの先頭ではなく最後」に書き込まれる 
		 * [例外] IOException - 指定されたファイルが存在するが通常ファイルではなくディレクトリである場合、
		 * 存在せず作成もできない場合、または何らかの理由で開くことができない場合
		 */
		try(FileWriter fw = new FileWriter("c:\\Users\\tmiya\\workspace\\Sukkiri2_9.2.1\\data.dat", false);){
			
			
			/*【JVMにファイルに書き込むよう指示を送る】
			 * write(String str) throws IOException
			 * 
			 * -str: 書き込まれる文字列
			 * [例外] IOException - 入出力エラーが発生した場合
			 */
			fw.write(" Minato");
			
			
			/*【JVMに対してファイルへの書き込みを強制的に行わせる】
			 * flush() throws IOException
			 * 
			 * [例外] IOException - 入出力エラーが発生した場合
			 */
			fw.flush();
			
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラーです");
		}
		
		/*
		 * 【新機能】finallyブロックの中に close() を記述せずに済むように
		 * try(FileWriter fw = new FileWriter("c:\\~", true);){
		 * 		（正常処理）
		 * } catch(IOException e) {
		 *  	（例外処理）
		 * }
		 * 
		 * 
		 * 【従来】
		 * FileWriter fw = null; //tryブロックの外で初期化しないと、finallyブロックでclose()を呼べない
		 * try{
		 * 		fw = new FileWriter("c:\\~", true);
		 * 		（正常処理）
		 * } catch(IOException) {
		 * 		（例外処理）
		 * } finally { //必ずファイルを閉じさせるためのfinallyブロック
		 * 		if(fw != null){
		 * 			try{ //close()がIOExceptionを送出する可能性を考えて
		 * 				if(fw != null)
		 * 					fw.close();
		 * 				}
		 * 			} catch (IOException e2){
		 * 			}
		 * }
		 */
		
		
		/*
		 * ***************************
		 * テキストファイルの読み込み*
		 * ***************************
		 */
		
		/*【ファイルを開く】
		 * FileReader(String fileName) throws FileNotFoundException
		 * 
		 * -fileName: 読み込むファイルへのパス
		 * 
		 * [例外] FileNotFoundException - 指定されたファイルが存在しないか、
		 * 通常ファイルでなくディレクトリであるか、またはなんらかの理由で開くことができない場合
		 */
		try(FileReader fr = new FileReader("c:\\Users\\tmiya\\workspace\\Sukkiri2_9.2.1\\data.dat");){
		
			System.out.println("ファイル読み込み開始");
			
			/*【単一の文字を読み込む】
			 * read() throws IOException
			 * 
			 * 読み込んだ文字は、「int型」で返される（ストリームの終わりに達した場合、「-1」が返る）
			 * [例外] IOException - 入出力エラーが発生した場合
			 */
			int i = fr.read();
			
			while(i != -1){  //ストリームの終わりに達するまでの間
				char c = (char) i; //読み込んだ文字はint型で返されるので、char型にキャストする
				System.out.println("ファイル読み込み結果: " + c);
				i = fr.read();
			}
			System.out.println("ファイル末尾に到達");
		} catch(IOException e2){
			System.out.println(e2.getMessage()); //getMessage() -> エラーメッセージをString型で取得する
			e2.printStackTrace(); // printStackTrace() -> スタックトレースの内容を画面に出力する
		}
		
	}
}
