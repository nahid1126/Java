package com.nasim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nasim.model.Department;
import com.nasim.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
@GetMapping("/createDepartment")
	public String departmentHomePage(Model model) {
		model.addAttribute("department", new Department());
		return "createUser/createDepartment";
	}

@PostMapping("/createDepartmentSuccess")
public String departmentCreateSuccess(Model model,Department depart) {
	departmentService.saveDepartment(depart);
	model.addAttribute("department", new Department());
	return "successful";
}
}
