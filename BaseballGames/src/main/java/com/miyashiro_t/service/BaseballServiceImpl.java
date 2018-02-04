package com.miyashiro_t.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.miyashiro_t.dao.BaseballDao;
import com.miyashiro_t.dao.DaoFactory;
import com.miyashiro_t.vo.BaseballPlayerHdVo;

@Component
public class BaseballServiceImpl implements BaseballService{

	private BaseballDao baseballDao;
	
	@Autowired
	public BaseballServiceImpl(DaoFactory factory) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.baseballDao = factory.getBaseballDao();
	}
	
	@Override
	public List<BaseballPlayerHdVo> load() {
		// TODO 自動生成されたメソッド・スタブ
		List<BaseballPlayerHdVo> baseballPlayerHdVos = baseballDao.load();
//		BaseballPlayerHdVo target = new BaseballPlayerHdVo.Builder().id(1).name_kanji("kanji").name_kana("kana").build();
		return baseballPlayerHdVos;
	}

}
