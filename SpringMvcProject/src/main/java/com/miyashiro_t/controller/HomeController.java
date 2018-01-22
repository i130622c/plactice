package com.miyashiro_t.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 * @return 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		System.out.println("hello");
		return "home";
//		logger.info("Welcome home! The client locale is {}.", locale);
//
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		String formattedDate = dateFormat.format(date);
//
//		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM member");
//
//		model.addAttribute("serverTime", formattedDate);
//		model.addAttribute("name_kanji", list.get(0).get("name_kanji"));
//
//		return "home";
	}

}
