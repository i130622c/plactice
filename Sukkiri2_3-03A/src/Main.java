import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Map<Hero, Integer> map = new HashMap<Hero, Integer>();
		map.put(new Hero("Ö“¡"), 3);
		map.put(new Hero("—é–Ø"), 7);
		
		for(Hero h: map.keySet()){
			System.out.println(map.get(h));
		}
	}
}