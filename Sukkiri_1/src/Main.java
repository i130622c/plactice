import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.println("勇者の名前を入力して下さい");
		String heroName = scan.nextLine();
		Hero h1 = new Hero(heroName);

		System.out.println("一緒に冒険をする魔法使いの名前を入力してください");
		String wizardName = scan.nextLine();
		Wand w1 = new Wand("魔法の杖", 1000, 500);
		Wizard wizard = new Wizard(wizardName, 700, 700, w1);

		System.out.println("一緒に冒険をする聖職者の名前を入力してください");
		String clericName = scan.nextLine();
		Cleric c1 = new Cleric(clericName, 1000, 100);

		System.out.println("このメンバーでパーティーを組んでもよろしいですか？");
		String stop1 = scan.nextLine();

		Matango[] monsters = new Matango[3];
		monsters[0] = new PoisonMatango("A", 200);
		monsters[1] = new PoisonMatango("B", 190);
		monsters[2] = new PoisonMatango("C", 180);
		String stop2 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);

		String stop3 = scan.nextLine();
		for (Matango i : monsters) {
			i.attack(h1);
		}
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop4 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop5 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop6 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop7 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
	}

}
