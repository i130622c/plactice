interface Func1 {
	public abstract boolean call(int x);
}

interface Func2 {
	public abstract String call(boolean male, String name);
}

public class Main {

	public static void main(String[] args) {

		FuncList funclist = new FuncList();
		
		Func1 func1 = FuncList::isOdd;
		boolean results1 = func1.call(5);
		if (results1 = true) {
			System.out.println(results1 + ": Šï”");
		} else {
			System.out.println(results1 + ": ‹ô”");
		}
		
		Func2 func2 = funclist::addNameOrefix;
		String results2 = func2.call(true, "Akasaka");
		System.out.println(results2);
		
	}
}
