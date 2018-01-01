import java.util.*;

public class Book implements Comparable<Book>, Cloneable {

	private String title;
	private Date publishDate;
	private String comment;

	/*
	 * remove()などのメソッドではオブジェクトの等価判定が行われる。 その際に、「何をもって同じと見なすか」をequals()メソッドで定義する。
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Book)) {
			return false;
		}
		Book b = (Book) o;
		//「タイトルと発行日」が同じであれば true
		if (! title.equals(b.title)) {
			return false;
		} 
		if (! publishDate.equals(b.publishDate)) {
			return false;
		} 
		
		return true;
	}


	/*
	 * Hash系のコレクション[HashSetクラス, LinkedHashSetクラス, HashMapクラス]では
	 * ハッシュ値を用いて等価判定を行う。したがって、remone()メソッドなどを使用する場合、
	 * equals()の定義に加え、hashCode()の定義も必要となる。
	 */
	@Override //
	public int hashCode() {
		int results = 37;
		results = results * 31 + title.hashCode();
		results = results * 31 + publishDate.hashCode();
		return results;
	}

	/*
	 * 何を基準に並び替えるのかという「自然順序づけ」を定義しておくことで sort()メソッドを利用してオブジェクトを並び替えることができる。
	 * 
	 * 【オブジェクトを任意に並び替える方法】 ①Comparableインターフェースの実装 + compareTo()メソッドの実装
	 * comareTo() -戻り値がマイナス： this < 引数 -戻り値が０： this = 引数 -戻り値がプラス： this > 引数
	 * 
	 * ②Comparatorインタフェースを実装した新クラスを作成 + compare()メソッドの実装 compare() -戻り値がマイナス：
	 * 引数1 < 引数2 -戻り値が0： 引数1 = 引数2 -戻り値がプラス： 引数1 > 引数2
	 */
	@Override
	public int compareTo(Book b) {
		return this.publishDate.compareTo(b.publishDate);
	}

	/*
	 * 同じインスタンスを生み出したい場合、 代入演算子を用いる方法は、「参照先がコピー」されるだけであるためダメ！
	 * clone()メソッドを用いることで、「インスタンス自体を複製」できる。
	 * 
	 * ただ、clone()メソッドは、基本的にプリミティブ型（int型, String型...）の変数しか複製しない（シャロー・コピー）
	 * フィールドにクラス型の変数が含まれる場合は、それらをディープ・コピーする処理を、別途記述する必要がある。
	 * 
	 * 【メソッドの複製方法】 Cloneableインターフェースの実装 + clone()メソッドの実装
	 */
	@Override
	public Book clone() {
		try {
			// シャロー・コピー *super.clope()を使用する！
			// 共変戻り値型： メソッドをオーバーライドする際、その戻り値をより限定された型に置き換えることができる
			// Object -> Book
			Book b = (Book) super.clone();
			// ディープ・コピー
			b.publishDate = (Date) publishDate.clone();
			return b;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}
	
	public String toString(){
		return title + " / " + comment + " / " + publishDate;
	}

	// ゲッターとセッター
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
