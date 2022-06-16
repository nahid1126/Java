package com.nasim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nasim.model.LeaveRequest;
import com.nasim.service.LeaveService;

@Controller
public class ReportController {
	@Autowired
	private LeaveService leaveRequstService;
	
	  @GetMapping( "/leaveaccepting")
	    public String ViewOnlyPendingLeaveRequest( Model model, @RequestParam(defaultValue = "0", name = "page") int page) {
		 Page<LeaveRequest> LeaveRequest = leaveRequstService.findallByAcceptRejectFlags(new PageRequest(page, 8),"accept");
		 model.addAttribute("leaveRequest",LeaveRequest);
		 
		return "report/reportGenerator";
	    }
}
