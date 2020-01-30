package com.cd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cd.model.CD;

@Controller
@RequestMapping("/CD")
public class CDController {
	
	@RequestMapping(method = RequestMethod.GET,path = "/showForm")
	public String showFormForAdd()
	{
		return "AddCd";
	}
	
	@RequestMapping("/processCD")
	public String processCD(@RequestParam("cdname") String name,
			@RequestParam("cdgenre") String genre,
			@RequestParam("cdtype") String type,Model theModel)
	{
		CD cd = new CD(name, genre, type);
		HomeController.addCD(cd);
		theModel.addAttribute("cd",cd);
		return "success";
	}

}
