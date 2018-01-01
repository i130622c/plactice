
public class Matango extends Monster {
	int hp;

	public Matango(String suffix, int hp) {
		super(suffix);
		this.hp = hp;
	}

	// 攻撃
	@Override
	public void attack(Character c) {
		StackTraceElement e = new Exception().getStackTrace()[1]; // getStackTrace()メソッド
		// これを呼ぶことで例外スタックトレースの内容を取得できる
		String className = e.getClassName(); // メソッドの呼び出し元クラスの名前を取得
		if (className == "PoisonMatango") {
			System.out.println("お化け毒キノコ" + getSuffix() + "の攻撃！");
		} else {
			System.out.println("お化けキノコ" + getSuffix() + "の攻撃！");
		}

	}

	// 逃げる
	@Override
	public void run() {
		StackTraceElement e = new Exception().getStackTrace()[1]; // getStackTrace()メソッド
		// これを呼ぶことで例外スタックトレースの内容を取得できる
		String className = e.getClassName(); // メソッドの呼び出し元クラスの名前を取得
		if (className == "PoisonMatango") {
			System.out.println("お化け毒キノコ" + getSuffix() + "は逃げ出した！");
		} else {
			System.out.println("お化けキノコ" + getSuffix() + "は逃げ出した！");
		}
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
