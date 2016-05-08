package com.pikia;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	protected final Logger logger = Logger.getLogger(IndexController.class);


	@RequestMapping(value = { "/blog/index" }, method = { RequestMethod.POST, RequestMethod.GET })
	public String blogIndex(HttpServletRequest request, HttpServletResponse response) {
		
		return "/blog/index";
	}
}
