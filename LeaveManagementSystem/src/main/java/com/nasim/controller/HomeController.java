package com.nasim.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nasim.model.Employee_information;
import com.nasim.service.EmployeeInformationService;

@Controller
public class HomeController {
	@Autowired
	private EmployeeInformationService employeeInformationService;

	@GetMapping("/")
	public String displayHome() {
		return "home";

	}

	@GetMapping("/profile")
	public String UserProfleEdit(Model model, Principal principal) {
		String username = principal.getName();
		System.out.println(username);
		Employee_information emp = employeeInformationService.UserInfo(username);
		//model.addAttribute("profilePic",emp.getProfilePic());
		model.addAttribute("emp", emp);
		return "user/userProfileEdit";
	}

	@GetMapping("/login")
	public String userlogin() {
		return "login";

	}

	@GetMapping(value = "/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}

}
