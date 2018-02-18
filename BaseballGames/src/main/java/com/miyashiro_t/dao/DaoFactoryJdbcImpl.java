package com.miyashiro_t.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DaoFactoryJdbcImpl implements DaoFactory {
	
	private final JdbcTemplate template;

	@Autowired
	public DaoFactoryJdbcImpl(JdbcTemplate template) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.template = template;
	}
	
	@Override
	public BaseballDao getBaseballDao() {
		// TODO 自動生成されたメソッド・スタブ
		return new BaseballDaoJdbcImpl(template);
	}

}
