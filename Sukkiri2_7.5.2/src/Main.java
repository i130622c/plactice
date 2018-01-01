
public class Main {

	/*
	 * 【メモリに関する情報の取得】 
	 * ①Runtime.getRuntime()メソッドを呼び出し、Runtimeインスタンスを生成
	 * ②Runtimeインスタンスに対して、以下のメソッドを呼び出す（戻り値: long型, 単位: バイト）
	 *  freeMemory() : 残りメモリ容量を返す
	 *  totalMemory() : 現在のメモリ総容量を返す
	 *  maxMemory() : メモリ総容量の限界値を返す
	 *  
	 *  〈慣用値: コンピュータで使用される値〉
	 *  1B  -(1024倍 : 2^10倍)->  1KB  -(1024倍)->  1MB  -(1024倍)->  1GB  -(1024倍)->  1TB
	 *  
	 *  〈国際単位系: 通常の単位〉
	 *  1B  -(1000倍 : 10^3倍)->  1KB  -(1000倍)->  1MB  -(1000倍)->  1GB  -(1000倍)->  1TB
	 */

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();

		// バイトで取得
		long f1 = run.freeMemory();
		long f2 = run.totalMemory();
		long f3 = run.maxMemory();

		System.out.println("残メモリ: " + f1 + " B, 使用メモリ: " + f2 + " B, メモリ総容量限界値: " + f3 + " B");

		// MBで取得
		long f4 = run.freeMemory() / 1024 / 1024;
		long f5 = run.totalMemory() / 1024 / 1024;
		long f6 = run.maxMemory() / 1024 / 1024;

		System.out.println("残メモリ: " + f4 + " MB, 使用メモリ: " + f5 + " MB, メモリ総容量限界値: " + f6 + " MB");
	}
}
