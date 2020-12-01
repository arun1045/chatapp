package com.caveofprogramming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController 
{
	@RequestMapping("/")
	//@ResponseBody
	String home()
	{
		//return "Hello World";
		return "app.homepage";
	}

	@RequestMapping("/about")
	//@ResponseBody
	String about()
	{
		//return "Hello World";
		return "app.about";
	}
	
	@RequestMapping("/addstatus")
	//@ResponseBody
	String addStatus()
	{
		//return "Hello World";
		return "app.addStatus";
	}
}



