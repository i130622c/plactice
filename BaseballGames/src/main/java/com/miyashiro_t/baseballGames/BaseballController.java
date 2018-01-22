package com.miyashiro_t.baseballGames;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.miyashiro_t.service.ServiceFactory;
import com.miyashiro_t.vo.BaseballPlayerHdVo;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/load")
public class BaseballController {
	
	private final ServiceFactory service;
	private static final Logger logger = LoggerFactory.getLogger(BaseballController.class);
	
	@Autowired
	public BaseballController(ServiceFactory service) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.service = service;
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("type", "load" );
		model.addAttribute("serverTime", formattedDate );
		
		BaseballPlayerHdVo result = service.getBaseballService().load().get(0);
		int id = result.getId();
		String name_kanji = result.getName_kanji();
		String name_kana = result.getName_kana();
		model.addAttribute("id", id);
		model.addAttribute("name_kanji", name_kanji);
		model.addAttribute("name_kana", name_kana);
		return "home";
	}
	
	
}
