package com.liuxing;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.test.TestService;

@Controller
public class HomeController {
	private static Logger log = Logger.getLogger(HomeController.class);
	static {
		log.info("let`s  go! static  走,,,,");
		TestService a = new TestService();
		a.testa();
	}

	/**
	 * 首页 返回至 /views/home.jsp页面
	 */
	@RequestMapping("index")
	public String toHome() {
		log.info("let`s  go!走");
		return "home";
	}

	@RequestMapping("index1")
	public ModelAndView toHome1() {
		// 创建模型和视图,用于渲染页面.并指向要返回的页面为home1
		ModelAndView mv = new ModelAndView();

		int a = 0;
		a = 122;
		System.out.println("let`s  go1111!" + a);
		mv.setViewName("home1");
		return mv;
	}

}