import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Hero> list = new ArrayList<Hero>();
		
		list.add(0, new Hero("�֓�"));
		list.add(1, new Hero("���"));
		
		for(Hero h: list){
			System.out.println(h.getName());
		}
	}
}
