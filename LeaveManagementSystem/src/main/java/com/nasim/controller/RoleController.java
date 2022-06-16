package com.nasim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nasim.model.Role;
import com.nasim.service.RoleService;

@Controller
public class RoleController {
	@Autowired
	private RoleService roleService;

	@GetMapping("/roleCreation")
	public String RoleCreationPage(Model model) {
		model.addAttribute("roleCreation", new Role());
		return "createUser/roleCreation";
	}
	@PostMapping("/RoleCreationsuccess")
	public String RoleCreationSuccess(Model model,Role role) {
		roleService.save(role);
		model.addAttribute("roleCreation", new Role());
		return"successful";
	}
}
