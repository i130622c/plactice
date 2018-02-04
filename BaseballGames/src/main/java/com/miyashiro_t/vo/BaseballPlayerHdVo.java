package com.miyashiro_t.vo;


public class BaseballPlayerHdVo {
	private final int id;
	private final String name_kanji;
	private final String name_kana;

	public static class Builder {
		private int id;
		private String name_kanji;
		private String name_kana;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name_kanji(String name_kanji) {
			this.name_kanji = name_kanji;
			return this;
		}

		public Builder name_kana(String name_kana) {
			this.name_kana = name_kana;
			return this;
		}

		public BaseballPlayerHdVo build() {
			return new BaseballPlayerHdVo(this);
		}
	}

	private BaseballPlayerHdVo(Builder builder) {
		this.id = builder.id;
		this.name_kanji = builder.name_kanji;
		this.name_kana = builder.name_kana;
	}

	BaseballPlayerHdVo(int id, String name_kanji, String name_kana) {
		this.id = id;
		this.name_kanji = name_kanji;
		this.name_kana = name_kana;
	}

	public int getId() {
		return id;
	}

	public String getName_kanji() {
		return name_kanji;
	}

	public String getName_kana() {
		return name_kana;
	}

}
