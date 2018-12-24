package com.wipro.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.login.model.Login;
import com.wipro.login.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
	}

	@RequestMapping(value = "/start",method = RequestMethod.POST)
	public String doLogin(Model model, @ModelAttribute("loginBean") Login loginBean) {
		if (loginBean.getUserId() != 0 && loginBean.getPassword() != null) {
			if (loginService.doLogin(loginBean.getUserId(), loginBean.getPassword()) != null) {
				model.addAttribute("msg", "welcome" + loginBean.getUserId());
				return "success";
			} else {
				model.addAttribute("error", "Invalid Details");
				return "login";
			}

		} else {
			model.addAttribute("error", "Please enter Details");
			return "login";
		}

}
