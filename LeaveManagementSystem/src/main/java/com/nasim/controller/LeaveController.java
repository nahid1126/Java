package com.nasim.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nasim.model.LeaveRequest;
import com.nasim.repository.EmployeeRepository;
import com.nasim.service.LeaveService;

@Controller
public class LeaveController {
	@Autowired
	private LeaveService leaveRequstService;

	@Autowired
	private EmployeeRepository userRepository;

	@GetMapping(value = "/apply_leave")
	public ModelAndView applyLeave(Model model) {
		ModelAndView mav = new ModelAndView("leave/applyleaveapplication");
		model.addAttribute("leaveRequest", new LeaveRequest());
		return mav;
	}

	@PostMapping(value = "/applysuccess")
	public ModelAndView submitApplyLeave(@ModelAttribute("leaveRequest") LeaveRequest leaveRequest, Model model) {
		ModelAndView mav = new ModelAndView("successful");
		model.addAttribute("user", userRepository.findAll());
		leaveRequest.setFromDate(new Date());
		leaveRequest.setToDate(new Date());
		leaveRequest.setAcceptRejectFlag("Pending");
		leaveRequstService.save(leaveRequest);

		return mav;
	}

	@GetMapping(value = "/view_leave")
	public ModelAndView viewLeave(Model model, @RequestParam(defaultValue = "0", name = "page") int page) {
		ModelAndView mav = new ModelAndView("leave/viewLeaveApplication");
		Page<LeaveRequest> request = leaveRequstService.allleaveRequest(new PageRequest(page, 8));
		model.addAttribute("leaverequest", request);
		model.addAttribute("leaveRequests", new LeaveRequest());
		return mav;
	}

	@GetMapping("/edit/{id}")
	public String viewLeaveApplication(@PathVariable("id") int id, Model model) {
		LeaveRequest leaveRequest = leaveRequstService.getLeaveRequestOnId(id);
		model.addAttribute("leaveRequest", leaveRequest);
		return "leave/Comments";
	}

	@PostMapping("/commentssuccess")
	public ModelAndView CommentsLeaveApplication(@ModelAttribute("leaveRequest") LeaveRequest leaveRequest) {
		ModelAndView mav = new ModelAndView("successful");
		leaveRequstService.save(leaveRequest);
		;

		return mav;
	}
	
	 @GetMapping( "/leavePending")
	    public String ViewOnlyPendingLeaveRequest( Model model, @RequestParam(defaultValue = "0", name = "page") int page) {
		 Page<LeaveRequest> LeaveRequest = leaveRequstService.findallByAcceptRejectFlags(new PageRequest(page, 8),"pending");
		 model.addAttribute("leaveRequest",LeaveRequest);
		 
		return "leave/viewLeavePending";
	    }

	 
	@GetMapping(value = "/view_granteleave")
	public ModelAndView viewCommentsLeaveApplication(Model model,
			@RequestParam(defaultValue = "0", name = "page") int page) {
		ModelAndView mav = new ModelAndView("leave/viewCommentsLeaveApplicationList");
		Page<LeaveRequest> LeaveRequest = leaveRequstService.allleaveRequest(new PageRequest(page, 8));
		model.addAttribute("LeaveRequest", LeaveRequest);
		model.addAttribute("leaveRequests", new LeaveRequest());
		return mav;
	}

	@GetMapping("/approve/{id}")
	public String acceptOrRejectLeaves(@PathVariable("id") int id, Model model) {
		LeaveRequest leaveRequest = leaveRequstService.getLeaveRequestOnId(id);
		model.addAttribute("leaveRequest", leaveRequest);
		return "leave/action";
	}


	@PostMapping("/approvesuccess")
	public ModelAndView ApprovedLeaveApplication(@ModelAttribute("leaveRequest") LeaveRequest leaveRequest) {
		ModelAndView mav = new ModelAndView("successful");
		leaveRequstService.save(leaveRequest);
		;

		return mav;
	}

	@GetMapping("/leaveStatus")
	public String viewLeaveStatus(Model model, @RequestParam(defaultValue = "0", name = "page") int page) {
		Page<LeaveRequest> leaveRequest = leaveRequstService.allleaveRequest(new PageRequest(page, 8));
		model.addAttribute("leaveRequest", leaveRequest);
		model.addAttribute("leaveRequests", new LeaveRequest());
		return "leave/viewLeaveStatus";
	}
	
	
	 @GetMapping( "/userleavePending")
	    public String ViewOnlyUserLeaveRequest( Model model) {
		 List<LeaveRequest> LeaveRequests = leaveRequstService.GetAlluserRoleName("ROLE_USER");
		 System.out.println("Leave is "+LeaveRequests);
		 model.addAttribute("leaveRequest",LeaveRequests);
		 
		return "leave/viewSupervisorLeaveApp";
	    }

}
