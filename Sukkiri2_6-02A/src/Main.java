interface Func1 {
	public abstract boolean call(int x);
}

interface Func2 {
	public abstract String call(boolean male, String name);
}

public class Main {

	public static void main(String[] args) {

		//�����_��
		//FuncList�ɐ錾���Ă������e��func1�ɑ��
		Func1 func1 = (int x) -> {
			return (x % 2 == 1);
		};
		
		boolean results1 = func1.call(5);
		if (results1 = true) {
			System.out.println(results1 + ": �");
		} else {
			System.out.println(results1 + ": ����");
		}

		
		//�����_��
		//FuncList�ɐ錾���Ă������e��func2�ɑ��
		Func2 func2 = (boolean male, String name) -> {
			if (male == true) {
				return "Mr. " + name;
			} else {
				return "Ms. " + name;
			}
		};
		String results2 = func2.call(true, "Akasaka");
		System.out.println(results2);

	}
}