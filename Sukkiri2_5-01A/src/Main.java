
public class Main {

	public static class Wallet{
		private int balance;
		private String name;
		
		public Wallet(int balance, String name){
			this.balance = balance;
			this.name = name;
		}
		
		public String toString(){
			return name + "の財布（所持金： " + balance + "）"; 
		}

		public int getBalance() {
			return balance;
		}

		public String getName() {
			return name;
		}
		
	}
	
	public static void main(String[] args) {
		Wallet w = new Wallet(10000, "Akasaka");
		
		StrongBox<Wallet> box = new StrongBox<Wallet>(KeyType.FINGER);
		box.put(w);
		for(int i = 1; i < 6; i++){
			System.out.println(box.get());
		}
	}
}
