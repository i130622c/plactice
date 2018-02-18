package com.miyashiro_t.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.miyashiro_t.dto.BaseballPlayerHdDto;
import com.miyashiro_t.vo.BaseballPlayerHdVo;

public class BaseballDaoJdbcImpl implements BaseballDao{

	private JdbcTemplate template;
	private static final String LOAD_SQL = "SELECT * FROM member";
	
	@Autowired
	public BaseballDaoJdbcImpl(JdbcTemplate template) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.template = template;
	}
	
	
	@Override
	public List<BaseballPlayerHdVo> load() {
		// TODO 自動生成されたメソッド・スタブ
		RowMapper<BaseballPlayerHdDto> mapper = new BeanPropertyRowMapper<BaseballPlayerHdDto>(BaseballPlayerHdDto.class);
		List<BaseballPlayerHdDto> hdDtoList = template.query(LOAD_SQL, mapper);
		
		List<BaseballPlayerHdVo> hdVoList = new ArrayList<>();
		for(BaseballPlayerHdDto hdDto : hdDtoList){
			BaseballPlayerHdVo target = new BaseballPlayerHdVo.Builder()
					.id(hdDto.getId())
					.name_kanji(hdDto.getNameKanji())
					.name_kana(hdDto.getNameKana()).build();
			hdVoList.add(target);
		}
//		return hdDtoList.stream()
//				.map(hdDto -> new BaseballPlayerHdVo.Builder()
//						.id(hdDto.getId())
//						.name_kanji(hdDto.getNameKanji())
//						.name_kana(hdDto.getNameKana()).build()).collect(Collectors.toList());
		return hdVoList;
	}
}
