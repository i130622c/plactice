package com.miyashiro_t.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactoryImpl implements ServiceFactory {

	private final BaseballService baseballService;

	@Autowired
	public ServiceFactoryImpl(BaseballService baseballService) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.baseballService = baseballService;

	}

	@Override
	public BaseballService getBaseballService() {
		// TODO 自動生成されたメソッド・スタブ
		return this.baseballService;
	}

}
