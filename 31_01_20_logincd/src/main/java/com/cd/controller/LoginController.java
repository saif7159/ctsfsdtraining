package com.cd.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cd.model.User;
import com.cd.model.UserList;

@Controller
@RequestMapping("/Login")
public class LoginController {
	@InitBinder("user")
	public void initBinder(WebDataBinder dataBinder) {
	StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
	dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,path = "/login")
	public String goLogin(Model model)
	{model.addAttribute("user",new User());
	 return "login";	
	}
	@RequestMapping(method = RequestMethod.POST,path = "/processLogin")
	public String processLogin(@ModelAttribute("user") User user)
	{
		boolean status = false;
		for(User u:UserList.getList()) {
		if((user.getEmail().equals(u.getEmail())) &&(user.getPassword().equals(u.getPassword()))) {
			status=true;
			
		}
		}
		if(status)
		{
			return "AddCd";
		}
		else {
			return "error";
		}

	}
	
	@RequestMapping("/signup")
	public String goSignup(Model model)
	{	model.addAttribute("usersignup", new User());
		return "signup";
	}
	

	
 @RequestMapping(method = RequestMethod.POST,path = "/processSignup")
 public String processUpdate(@Valid@ModelAttribute("usersignup") User user,BindingResult theResult)
 {
	
 	
 if(theResult.hasErrors())
 {
	 return "signup";
 }
 else {
	 UserList.addUser(user);
 return "CdMenu";	
 }}


}
