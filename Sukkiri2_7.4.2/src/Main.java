
import java.util.*;
public class Main {

	public static void main(String[] args) {
		/*
		 * 【キーを指定し、対応するプロパティ値を取得】
		 * System.getProperty(String key) : 指定したキーの値（文字列）を取得。
		 * System.getProperty(String key, String def) : 指定したキーの値（文字列）を取得。プロパティ値がない場合、デフォルト値を返す。
		 * 
		 * System.getInteger(String key) : 指定したキーの値（Integer）を取得。
		 * System.getInteger(String key, int def) : 指定したキーの値（Integer）を取得。プロパティ値がない場合、デフォルト値を返す。
		 * 
		 * System.getBoolean(String key) : 指定したキーの値（boolean）を取得。プロパティ値がない場合、falseを返す。
		 */
		System.out.println("【Javaバージョン】");
		System.out.println(System.getProperty("java.version"));
		
		
		/*
		 * 【キー と 値 をセットで取得（プロパティ－リストの取得）】
		 * System.getProperty() : Properties型で取得
		 * 
		 * management.RuntimeMXBean.getSystem.Properties() : Map<String, String>で取得
		 */
		System.out.println("【システムプロパティ一覧】");
		Properties p = System.getProperties(); 
		
		//stringPropertyNames() : プロパティ－リスト内の「キー & 対応する値（文字列）」をセットで取得
		/*リスト要素の取り出し方法は、1)for文, 2)拡張for文, 3)iterator
		 * 
		 * Iterator<リスト要素の型> it = リスト変数.iterator();
		 * while(it.hasNext()){リスト要素の型 e = it.next();}
		 */
		Iterator<String> it = p.stringPropertyNames().iterator(); 
		while(it.hasNext()){
			String key = it.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
		
		/*
		 * 【指定したキーに対応するプロパティ－値を変更】
		 * System.setProperty(String key, String value) : 指定したキーに対応する値を「設定」
		 * System.clearProperty(String key) : 指定したキーに対応する値を「削除」
		 */
	}
}
