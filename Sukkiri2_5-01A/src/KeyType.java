
public enum KeyType {

	PADLOCK("南京錠"), BUTTON("押ボタン"), DIAL("ダイヤル"), FINGER("指紋認証");
	
	private String name;
	
	KeyType(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
