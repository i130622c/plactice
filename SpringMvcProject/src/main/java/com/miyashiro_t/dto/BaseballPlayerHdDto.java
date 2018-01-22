package com.miyashiro_t.dto;

public class BaseballPlayerHdDto {
	private int id;
	private String name_kanji;
	private String name_kana;
	
	public BaseballPlayerHdDto(int id, String name_kanji, String name_kana) {
		this.id = id;
		this.name_kanji = name_kanji;
		this.name_kana = name_kana;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameKanji() {
		return name_kanji;
	}

	public void setNameKanji(String name_kanji) {
		this.name_kanji = name_kanji;
	}

	public String getNameKana() {
		return name_kana;
	}

	public void setNameKana(String name_kana) {
		this.name_kana = name_kana;
	}
}
