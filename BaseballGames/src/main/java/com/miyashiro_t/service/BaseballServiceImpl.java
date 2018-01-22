package com.miyashiro_t.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.miyashiro_t.vo.BaseballPlayerHdVo;

@Component
public class BaseballServiceImpl implements BaseballService{

	@Override
	public List<BaseballPlayerHdVo> load() {
		// TODO 自動生成されたメソッド・スタブ
		List<BaseballPlayerHdVo> baseballPlayerHdVos = new ArrayList<>();
		BaseballPlayerHdVo target = new BaseballPlayerHdVo.Builder().id(1).name_kanji("kanji").name_kana("kana").build();
		baseballPlayerHdVos.add(target);
		return baseballPlayerHdVos;
	}

}
