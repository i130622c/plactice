
public class Main {

	public static void main(String[] args) {
		/*
		 * 【指定したクラスに関する情報を取得する方法】
		 * 1) Class<?> cinfo = Class.forName(FQCN文字列);
		 * 2) Class<?> cinfo = クラス名.class;
		 * 3) Class<?> cinfo = 変数名.getClass();
		 */
		
		Class<?> cinfo = String.class; //クラスの情報を取得(2)
		
		/*
		 * 【型情報を取得するためのメソッド】
		 */
		System.out.println(cinfo.getName()); //FQCNを取得する -> java.lang.String
		System.out.println(cinfo.getSimpleName()); //クラス名部分のみ取得する -> String
		
		//getPacage()メソッド: 所属するパッケージ情報を返す
		//getName()と組み合わせることで、パッケージ名を取得できる
		System.out.println(cinfo.getPackage().getName()); //所属するパッケージ名を取得する -> java.lang
		
		System.out.println(cinfo.isArray()); //配列であるかどうか調べる -> false
		System.out.println(cinfo.isInterface()); //インターフェースであるかどうか調べる -> false
		System.out.println(cinfo.isEnum()); //列挙型であるか調べる -> false
		
		Class<?> cinfo2 = cinfo.getSuperclass(); //親クラスの情報を取得する
		System.out.println(cinfo2.getName()); // -> java.lang.Object
		System.out.println(cinfo2.getSimpleName()); // -> Object
		
		
		
		Class<?> cinfo3 = args.getClass(); //クラスの情報を取得(3)
		System.out.println(cinfo3.isArray()); //String[]型であるため、-> true
	}
}
