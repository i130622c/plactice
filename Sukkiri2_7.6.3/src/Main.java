import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * 【指定したクラスに関する情報を取得する方法】
		 * 1) Class<?> cinfo = Class.forName(FQCN文字列);
		 * 2) Class<?> cinfo = クラス名.class;
		 * 3) Class<?> cinfo = 変数名.getClass();
		 */
		Class<?> clazz = RefSample.class; //(2)

		/*
		 * 【メンバを取得するためのメソッド】 
		 *  java.util.reflrctパッケージに属する「Fieldクラス」「Methodクラス」「Constructorクラス」を利用
		 *  基本的に、指定したクラスに宣言されたフィールド、メソッド、コンストラクタのみ返す。
		 *  注)親クラスから継承したモノも併せて取得する場合、「Declared」を取り除く！
		 */
		
		//getDeclaredConstructor() : コンストラクタの一覧を取得する
		Constructor<?> cons = clazz.getConstructor(int.class); // -> 「int型」の引数を「1つ」指定しているコンストラクタを取得
		
		
		//newInstance() : 指定された引数を用いてインスタンスを生成する
		RefSample rs = (RefSample) cons.newInstance(256); // -> コンストラクタ RefSample(int x) に「256」を渡し、newする
		
		
		//getDeclaredField(String name) : 指定した名前のフィールドを取得する
		//getDeclaredFields() : フィールドの一覧を取得する
		Field f = clazz.getField("times"); // -> int型フィールド「times」を取得
		
		
		//set(Object obj, Object value) * obj: フィールドを変更するオブジェクト, value: 新しいフィールド値 
		f.set(rs, 2); //「RefSample」インスタンスの「time」フィールドに「2」を代入
		
		
		//get(Object obj) *obj: 取得しようとしているフィールド値が宣言されているオブジェクト
		System.out.println(f.get(rs)); // -> 「RefSampleインスタンス」に宣言されている「times」フィールドの値を取得
		
		
		//getDeclaredMethod(String name, Class<?>...parameterTyoes) : 指定した名前と引数の型を持つメソッドを取得
		//* name: メソッドの名前, parameterTypes: 引数の型
		//getDeclaredMethods() : メソッドの一覧を取得する
		Method m = clazz.getMethod("hello", String.class, int.class); // -> hello(String msg, int t)を取得
		
		
		//invoke(Object obj, Object...args) : メソッドを、指定したオブジェクトに対して指定した引数で呼び出す
		//* obj: メソッドが宣言されているオブジェクト, args: メソッドの呼び出しに使用する引数
		m.invoke(rs, "reflection!", 128);
		
		
		//getModifiers() : クラスまたはインターフェースの属性情報(static, final, public...)を返す
		// * 返り値: 属性情報を「int型」に符号化して返す
		
		//isPublic(int mod) : 整数の引数にpublic修飾子が含まれる場合にtrueを返す
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		System.out.println(pubc);
		
		//isFinal(int mod) : 整数の引数にfinal修飾子が含まれる場合にtrueを返す  
		boolean finm = Modifier.isFinal(m.getModifiers());
		System.out.println(finm);
	}
}
