package com.miyashiro_t.dto;

public class BaseballPlayerHdDto {

	private int id;
	private String nameKanji;
	private String nameKana;
	
	public BaseballPlayerHdDto() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public BaseballPlayerHdDto(int id, String nameKanji, String nameKana) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.id  =id;
		this.nameKanji = nameKanji;
		this.nameKana = nameKana;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameKanji() {
		return nameKanji;
	}
	public void setNameKanji(String nameKanji) {
		this.nameKanji = nameKanji;
	}
	public String getNameKana() {
		return nameKana;
	}
	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}
	
	
}
