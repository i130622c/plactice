import java.util.*;

public class Cleric extends Character {
	final static int MAX_HP = 1000;
	final static int MAX_MP = 100;

	Cleric(String name, int hp, int mp) {
		super(name, hp, mp);
		System.out.println("【名前：" + getName() + ", HP：" + getHp() + ", MP：" + getMp() + "】の聖職者が誕生した！");
	}

	public void selfAid(Character... c) {
		System.out.println("聖職者" + getName() + "は「セルフエイド」を唱えた！");
		setMp(getMp() - 10);
		System.out.println("聖職者" + getName() + "のMPが10消費された！(現在のMPは「" + getMp() + "」)");
		for (Character i : c) {
			i.setHp(i.getHp() + 50);
			System.out.println(i.getName() + "のHPが50回復した！");
		}
	}

	public int pray(int sec) {
		System.out.println("聖職者" + getName() + "は" + sec + "秒間祈った！");
		int recover = new Random().nextInt(3) + sec;
		setMp(Math.min(MAX_MP, getMp() + recover));
		System.out.println("聖職者のmpが" + getMp() + "まで回復した");
		return recover;
	}

}
