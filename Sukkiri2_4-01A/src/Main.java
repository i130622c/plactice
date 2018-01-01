import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) throws ParseException {
		//equals()�e�X�g
		Book b1 = new Book();
		b1.setTitle("�X�b�L���킩��Java");
		b1.setComment("���ɗǂ�");
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd");
		Date d1 = f1.parse("2017/03/27");
		b1.setPublishDate(d1);
		
		Book b2 = new Book();
		b2.setTitle("�X�b�L���킩��Java");
		b2.setComment("�ǂ�");
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd");
		Date d2 = f2.parse("2017/03/27");
		b2.setPublishDate(d2);
		
		System.out.println(b1.equals(b2));
		
		//equals() + hashCode()�e�X�g
		Book b3 = new Book();
		b3.setTitle("Python����");
		b3.setComment("���ɗǂ�");
		SimpleDateFormat f3 = new SimpleDateFormat("yyyy/MM/dd");
		Date d3 = f3.parse("2010/03/27");
		b3.setPublishDate(d3);
		
		Book b4 = new Book();
		b4.setTitle("HTML/CSS����");
		b4.setComment("�ǂ�");
		SimpleDateFormat f4 = new SimpleDateFormat("yyyy/MM/dd");
		Date d4 = f4.parse("2000/01/25");
		b4.setPublishDate(d4);
		
		Set<Book> list = new HashSet<Book>();
		list.add(b3);
		list.add(b4);
		System.out.println("�v�f���F " + list.size());
		System.out.println(list);
		System.out.println("remove()���\�b�h�Ăяo�� -> b3�폜");
		list.remove(b3);
		System.out.println("�v�f���F " + list.size());
		System.out.println(list);

		//compareTo()�e�X�g
		ArrayList<Book> array = new ArrayList<Book>();
		array.add(b1);
		array.add(b2);
		array.add(b3);
		array.add(b4);
		System.out.println(array);
		Collections.sort(array);
		System.out.println(array);
		
		//clone()�e�X�g
		Book b5 = b3.clone(); //b5.publichDate: 2010/03/27
		b5.setPublishDate(d1);//b5.publishDate: 2017/03/27
		System.out.println(b3);//Exception: 2010/03/27
		System.out.println(b5);//Exception: 2017/03/27
	}
}
