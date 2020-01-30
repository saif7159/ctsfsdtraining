package com.cd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cd.model.CD;

@Controller
public class HomeController {
	static List<CD> list = null;
	{
		list = new ArrayList<CD>();
	}
	public static void addCD(CD cd)
	{
		list.add(cd);
	}
	
@RequestMapping("/")
public String goHome()
{
return "CdMenu";	
}
@RequestMapping("/viewcd.view")
public String showCD(Model themodel)
{

themodel.addAttribute("list", list);
return "viewcd";
}
}
