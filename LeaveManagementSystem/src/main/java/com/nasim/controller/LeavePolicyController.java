package com.nasim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nasim.model.Employee_information;
import com.nasim.model.LeavePolicy;
import com.nasim.service.LeavePolicyService;

@Controller
public class LeavePolicyController {
	@Autowired
	private LeavePolicyService leaveService;

	@GetMapping("/leavepolicy")
	public String LeavePolicyCreationForm(Model model) {
		model.addAttribute("leavePolicy", new LeavePolicy());
		return "leavePolicy/leavePolicyCreation";
	}

	@PostMapping("/policyCreatesuccessful")
	public String LeavePolicyCreation(LeavePolicy policy) {
		leaveService.createLeavePolicy(policy);
		return "successful";

	}
	
	@GetMapping("/allLeavePolicy")
	public String allLeavePolicy(Model model,@RequestParam(defaultValue = "0", name = "page") int page) {
		Page<LeavePolicy> policyList = leaveService.getAllLeavePolicy(new PageRequest(page, 3));
		model.addAttribute("policyList", policyList);
		model.addAttribute("policyLists", new LeavePolicy());
		return "leavePolicy/leavePolicyList";
	}
}
