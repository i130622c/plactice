import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Hero> list = new ArrayList<Hero>();
		
		list.add(0, new Hero("Ö“¡"));
		list.add(1, new Hero("—é–Ø"));
		
		for(Hero h: list){
			System.out.println(h.getName());
		}
	}
}
